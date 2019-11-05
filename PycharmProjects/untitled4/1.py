from random import randint as zhouzexing
red_balls=[]
while len(red_balls)<7:
    red_ball=zhouzexing(1,33)
    if red_ball not in red_balls:
        red_balls.append(red_ball)
blue_ball=zhouzexing(1,16)
red_balls.sort()
print("红球:",red_balls)
print("篮球:",blue_ball)

