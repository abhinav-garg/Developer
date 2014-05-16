import web
from web import form

render = web.template.render('templates/')

urls = ('/', 'index')

login = form.Form(
    form.Textbox('username'),
    form.Password('password'),
    form.Button('Login'),
)


class index:
	def GET(self):

		# i = web.input(name = None)
		f = login()
		return render.index(f)
		
if __name__ == '__main__':
	app = web.application(urls, globals())
	app.run()

