# x=eval(input('输入第一个数字：'))
# y=eval(input('输入第二个数字：'))
# z=eval(input('输入第三个数字：'))
# if x > y:
#     t=x
#     x=y
#     y=t
# if x > z:
#     t = x
#     x = z
#     z = t
# if y > z:
#     t = y
#     y = z
#     z = t
# print('按有小到大的顺序排列')
# print(x,y,z)
# print('按有大到小的顺序排列')
# print(z,y,x)

# for i in range(1,101):
#     if i%3==0:
#         print(i)

for i in range(1,5):
    for j in range(1,i+1):
        print('#',end="")
    print()

for i in range(1,5):
    for k in range(1,i):
        print(' ',end="")
    for j in range(1,10-i*2):
        print('*',end="")
    print()