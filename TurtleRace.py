import turtle
import random
import time

obj = turtle.Turtle()
obj.up()
obj.hideturtle()
obj.screen.bgcolor("black")
obj.screen.title("Turtle's Race")
obj.color("brown")
obj.pensize(3)
obj.write("TURTLE'S RACE !",align="center",font={"verdana",20,"normal"})
time.sleep(5)
obj.clear()
obj.write("Disclaimer - Please maximize your screen.",align="center",font={"verdana",20,"normal"})
time.sleep(3)
obj.color("white")
obj.clear()


# Racers:-

obj1 = obj.clone()
obj2 = obj.clone()
obj3 = obj.clone()
obj4 = obj.clone()
obj5 = obj.clone()

# Racer's Configuration:-

obj1.color("cyan")
obj1.shape("turtle")
obj1.shapesize(2,3)
obj1.pensize(3)

obj2.color("red")
obj2.shape("turtle")
obj2.shapesize(2,3)
obj2.pensize(3)

obj3.color("green")
obj3.shape("turtle")
obj3.shapesize(2,3)
obj3.pensize(3)

obj4.color("blue")
obj4.shape("turtle")
obj4.shapesize(2,3)
obj4.pensize(3)

obj5.color("yellow")
obj5.shape("turtle")
obj5.shapesize(2,3)
obj5.pensize(3)

# Racer-Screen Configuration:-

obj1.up()
obj1.hideturtle()
obj2.up()
obj2.hideturtle()
obj3.up()
obj3.hideturtle()
obj4.up()
obj4.hideturtle()
obj5.up()
obj5.hideturtle()

obj.forward(600)
obj.down()
obj.left(90)
obj.forward(350)
obj.backward(700)
obj.forward(350)
obj.up()
obj1.goto(0,0)
obj2.goto(0,150)
obj3.goto(0,-150)
obj4.goto(0,300)
obj5.goto(0,-300)
obj1.backward(600)
obj2.backward(600)
obj3.backward(600)
obj4.backward(600)
obj5.backward(600)

obj1.showturtle()
obj1.down()
obj2.showturtle()
obj2.down()
obj3.showturtle()
obj3.down()
obj4.showturtle()
obj4.down()
obj5.showturtle()
obj5.down()

time.sleep(5)

# Racing Starts:-

dist1 = random.randint(1,10)
dist2 = random.randint(1,10)
dist3 = random.randint(1,10)
dist4 = random.randint(1,10)
dist5 = random.randint(1,10)

a,b,c,d,e = dist1,dist2,dist3,dist4,dist5

while a < 1200 and b < 1200 and c < 1200 and d < 1200 and e < 1200:
    
    obj1.forward(dist1)
    obj2.forward(dist2)
    obj3.forward(dist3)
    obj4.forward(dist4)
    obj5.forward(dist5)
    
    dist1 = random.randint(1,10)
    dist2 = random.randint(1,10)
    dist3 = random.randint(1,10)
    dist4 = random.randint(1,10)
    dist5 = random.randint(1,10)

    a,b,c,d,e = dist1+a,dist2+b,dist3+c,dist4+d,dist5+e

if a >= 1200:
    obj.up()
    obj.goto(0,20)
    obj.down()
    obj.color("cyan")
    obj.write("Cyan turtle won the race.",align="center",font={"verdana",10,"normal"})
if b >= 1200:
    obj.up()
    obj.goto(0,170)
    obj.down()
    obj.color("red")
    obj.write("Red turtle won the race.",align="center",font={"verdana",10,"normal"})
if c >= 1200:
    obj.up()
    obj.goto(0,-130)
    obj.down()
    obj.color("green")
    obj.write("Green turtle won the race.",align="center",font={"verdana",10,"normal"})
if d >= 1200:
    obj.up()
    obj.goto(0,320)
    obj.down()
    obj.color("blue")
    obj.write("Blue turtle won the race.",align="center",font={"verdana",10,"normal"})
if e >= 1200:
    obj.up()
    obj.goto(0,-280)
    obj.down()
    obj.color("yellow")
    obj.write("Yellow turtle won the race.",align="center",font={"verdana",10,"normal"})
