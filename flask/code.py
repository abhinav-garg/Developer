from flask import Flask, render_template, request, url_for, jsonify

from numpy import matrix
from math import *

# globals() returns a dictionary of globals variables. You can create a new variable by simply writing globals()['a'] = 1, and that would lead to creation of a variable a = 1
globals()['ans'] = 0	# Default value for answer

# Initialize the Flask application
app = Flask(__name__)

# Route default URL, changes as per the HTTP request is GET or POST
@app.route("/", methods = ['GET','POST'])
def index():
	if request.method == 'POST':
		query = request.form['query']	# Query received from the form's textarea - from whatever form that makes a POST request to this URL
		
		assign_flag = False		# Keep a flag in case user tries to assign something to a variable

		# Allowance for assignments in input query
		if "=" in query:
			assign_flag = True	# Set flag true - user trying to assign a variable

			equation = [el.strip() for el in query.split("=")]
			query = equation[1]		# The expression to be evaluated
			# globals()[temp[0]] = eval(query) 	# The variable to assign the result of that expression

		try:
			if not '.' in query:
				query = query.lower()	# Get rid of case-sensitivity only if matrix methods aren't accessed
			
			result = eval(query)	# eval() evaluates a string which contains a method - built-in python function

			try:	# Handle matrices
				if(type(result)==type(list())):
					result = matrix(result)
			except Exception as e:
				print e
				print 'Calculations: Error parsing matrix'	# Log error to server console
		
			globals()['ans'] = result 	# Stores the last result in the variable answer
		
		except Exception as e:
			print e
			result = "Invalid expression"
				
		if assign_flag:		# If user intended to create a variable
			globals()[equation[0]] = result		# Store evaluated expression in the variable
	
	else:	# If request method is GET or something else
		result = ''

	return render_template('index.html', result = result)

if __name__ == "__main__":
    app.run()
