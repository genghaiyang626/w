from book_system_manage.book_list_manage import *
from book_system_manage.inventory_manage import *

#打印功能展示
def print_menu():
    print("")
    print("图书库存管理系统V0.1")
    print("1.显示书目信息")
    print("2.显示图书库存信息")
    print("3.添加书目信息")
    print("4.修改图书库存量")
    print("5.退出系统")
    print("="*20)


booklist = [["9787517042099","Photoshop入门到创意","2016-04-01",45.00],
            ["9787115480354","SSM轻量级框架应用实战","2018-05-01",66.80],
            ["9787517042242","HTML5+CSS3前端技术","2016-04-01",52.00]]
inventory = {"9787517042099":5, "9787115480354":4, "9787517042242":7}
while True:
    print_menu()
    action = int(input("请输入要执行的操作（填写数字）:"))
    # 显示书目信息
    if action == 1:
        print("=" * 20)
        print_book_list(booklist)
        print("=" * 20)
    # 显示库存信息
    elif action == 2:
        print("=" * 20)
        print_book_inventory(booklist, inventory)
        print("=" * 20)
        pass
    # 添加书目信息
    elif action == 3:
        print("=" * 20)
        code = input("请输入书号：")
        name = input("请输入书名：")
        publish_date = input("请输入出版时间：")
        price = input("请输入价格：")
        booklist = add_book_info(booklist, code, name, publish_date,price)
        print("=" * 20)
        pass
    # 修改图书库存量
    elif action == 4:
        print("=" * 20)
        code = input("请输入书号：")
        num = input("请输入库存量：")
        change_book_store(inventory, code, num)
        print("=" * 20)
        pass
    elif action == 5:
        print("谢谢使用")
        break
    else:
        print("请按要求填写正确数字")
        break