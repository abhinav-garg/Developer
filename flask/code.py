from flask import Flask, render_template, request, url_for

from numpy import matrix
from math import *

# Initialize the Flask application
app = Flask(__name__)

# Route for the default URL
@app.route("/")
def index():
	return render_template('index.html', result = '')

# Route for form's action, handles POST requests
@app.route("/", methods = ['POST'])
def form_action():
	query = request.form['query']
	if "=" in query:
		temp = [el.strip() for el in query.split("=")]
		query = temp[1]
	try:
		result = str(eval(query))
	except:
		result = "Invalid input"
	return render_template('index.html', result = result)

if __name__ == "__main__":
    app.run()
