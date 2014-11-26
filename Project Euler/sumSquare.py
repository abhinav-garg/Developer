def sumSquare(n):
	s1 = (n*(n+1)/2)**2
	s2 = n*(n+1)*(2*n+1)/6
	return s1-s2
print sumSquare(100)