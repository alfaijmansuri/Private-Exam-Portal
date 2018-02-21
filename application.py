from flask import Flask, render_template, request, session, redirect, url_for
from flask_session import Session



app = Flask(__name__)

app.config["SESSION_PERMANENT"] = False
app.config["SESSION_TYPE"] = "filesystem"
Session(app)

# Limit 50
messageList = []


@app.route("/")
def index():
    if session.get("username") is None:
        return render_template("setname.html")
    else:
        return render_template("index.html",messages=messageList,username=session.get("username"))


@app.route("/message",methods=["POST","GET"])
def message():
    if request.method == "POST":
        msg = request.form.get("msg")
        if not msg == "": 
            if len(messageList) > 50:
                del messageList[0]
            messageList.append((session.get("username"),msg))
        return render_template("index.html",messages=messageList,username=session.get("username"))
    else:
        return render_template("index.html",messages=messageList,username=session.get("username"))


@app.route("/setname",methods=["POST","GET"])
def setname():
    if request.method == "POST":
        username = request.form.get('username')
        session["username"] = username
        return redirect(url_for('index'))
    else:
        return render_template("setname.html")



try:
    app.run(threaded=True,host="0.0.0.0")
except:
    print("Error occured")