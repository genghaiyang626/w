#显示库存信息
def print_book_inventory(booklist, inventory):
    print("书号\t\t\t\t\t\t", "书名\t\t\t\t\t\t","库存")
    for bookinfo in booklist:
        print(bookinfo[0], "\t\t", bookinfo[1], "\t\t",inventory[bookinfo[0]])

#修改图书库存量
def change_book_store(inventory, code, num):
    code=code
    if code in inventory:
        inventory[code] = num
        print("库存修改成功")
    else:
         print("图书不存在，无法修改库存")
    print("请输入正确图书信息")
