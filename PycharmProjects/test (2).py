class LoanCaculator():
    def __init__( loan, time):
        self.loan = loan
        if time = "1":
            self.time = 3
        elif time = "2":
            self.time = 5
        else time = "3":
            self.time = 20
    def get_total_interests():
        total_interests = self.loan * self.get_interests_rate()
    def get_interests_rate():
        if self.time == 3:
            return 0.0603
        elif self.time == 5:
            return 0.0612
        else self.time == 20:
            return 0.0639

    def get_monthly_payment():
        monthly_payment = (self.loan + self.get_total_interests()) / (self.time * 12)
        loan = int(input("请输入贷款金额："))
        time =int(input("请选择贷款年限：1.3年（36个月） 2.5年（60个月） 3.20年（240个月）"))
        loan_caculate = LoanCaculator(loan, time)
        print("月供为：%f" % loan_caculate.get_monthly_payment())