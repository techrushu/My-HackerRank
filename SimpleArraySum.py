n = int(input())
ar = input().split()
temp = list(ar)
sum = 0
i = 0
while i < len(temp):
  sum += int(temp[i])
  i =i + 1
print(sum)