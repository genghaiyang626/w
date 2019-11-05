#显示书目信息
def print_book_list(booklist):
     print("书号\t\t\t\t\t\t","书名\t\t\t\t\t\t","出版时间\t\t\t","价格")
     for bookinfo in booklist:
        print(bookinfo[0],"\t\t",bookinfo[1],"\t\t",bookinfo[2],"\t\t",bookinfo[3],"\t\t")

#添加书目信息
def add_book_info(booklist, code, name, publish_date,price):
    for bookinfo in booklist:
        if code in bookinfo:
            print("此图书已存在于书目中，无法重新添加")
            break
        else:
            booklist.append(code)
            booklist.append(name)
            booklist.append(publish_date)
            booklist.append(float(price))
            print_book_list(booklist)
            return booklist
            print("图书信息添加成功")
            break
