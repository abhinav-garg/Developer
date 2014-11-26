def isPrime(n):
	for i in range(2, n):
		if n%i == 0:
			return False
	return True
count = 0
i = 2
while count < 10001:
	if isPrime(i):
		count += 1
		print '#', count, i
	i += 1
