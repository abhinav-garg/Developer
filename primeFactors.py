def primeFactors(num):
	"""Returns all prime factors of the number, with their counts"""
	factors = []
	d = 2
	while num > 1:
		while num % d == 0:
			factors.append(d)
			num /= d
		d += 1
	return factors

pfs = primeFactors(600851475143)
largestPrimeFactor = max(pfs)

print pfs
print largestPrimeFactor

