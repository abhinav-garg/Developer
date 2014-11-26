def isPrime(n):
	for i in range(2, n):
		if n%i == 0:
			return False
	return True
count = 0
i = 2
s = 0
while i <= 2000000:
	if isPrime(i):
		count += 1
		s += i
		print '#', count, i
	i += 1
print s