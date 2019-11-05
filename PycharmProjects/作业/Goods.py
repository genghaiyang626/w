class Goods:
    def __init__(self,id,name,salary,num):
        self.id=id
        self.name=name
        self.salary=salary
        self.num=num

    def sum(self):
        sum=self.salary*self.num
        print(self.name+"的总金额：",sum)
        return sum

苹果 = Goods(1,"苹果",10,50)
荔枝 = Goods(2,"荔枝",8,100)
桃子 = Goods(3,"桃子",9,80)
total=苹果.sum()+荔枝.sum()+桃子.sum()
print("三种商品的总金额合计：",total)