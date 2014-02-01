def collatzSequence(n):
	sequence = [n]
	while n != 1:
		if n % 2 == 0:
			n /= 2
			sequence.append(n)
		else:
			n = (3 * n) + 1
			sequence.append(n)
	return sequence

# print collatzSequence(1)

maxLen = 0
maxNum = 0

for ind, num in enumerate(range(1,1000001)):
	seqLen = len(collatzSequence(num))
	if seqLen > maxLen:
		maxLen = seqLen
		maxNum = num
	print '#' + str(ind) + '#', 'NUM', maxNum, 'MAX', maxLen, 'CURR', seqLen 