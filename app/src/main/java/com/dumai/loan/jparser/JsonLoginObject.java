package com.dumai.loan.jparser;

/**
 * 名称：JsonLoginObject
 * 描述：登录解析类
 *
 * @author haoruigang
 * @version v1.0
 * @date：2017 2017/11/29 9:41
 */
public class JsonLoginObject {


    /**
     * result : {"msg":"success","code":"1","data":{"password":"123456","mobile":"18510507183","lenderid":"1"}}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * msg : success
         * code : 1
         * data : {"password":"123456","mobile":"18510507183","lenderid":"1","token": "D89D35DEB0EAD95AC93A88364B61B1ED"}
         */

        private String msg;
        private String code;
        private DataBean data;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * password : 123456
             * mobile : 18510507183
             * lenderid : 1
             * token : D89D35DEB0EAD95AC93A88364B61B1ED
             */

            private String token;
            private String lenderid;      //贷款ID
            private String lender_name;     //贷款人姓名
            private String sex;     //性别
            private String order_date;     //创建时间
            private String maritalStatus;     //婚姻状况（已婚、未婚）
            private String card_num;     //身份证号码
            private String card_address;    //常住地址
            private String life_province;     //常住-所在省
            private String mobile;     //手机号
            private String password; //密码,
            private String card_city;     //常住-所在市
            private String card_coutry; //常驻-所在区
            private String work_profession;     //职业
            private String mobile_num;    //手机号码、作为登录微信公众号的用户名
            private String mobile_password;     //手机服务密码
            private String work_company;     //贷款人所在公司名称
            private String blank_name;    // 银行名称
            private String blank_account;     //银行账号
            private String age;     //年龄
            private String card_province;     //籍贯-解析-省
            private String card_city2;     //籍贯-解析-市
            private String birthplace;     //籍贯-解析-地址
            private String card_sex;     //性别-解析身份证的性别
            private String card_age;     //年龄-解析身份证年龄
            private String education_status;     //学历
            private String income_year;     //年收入
            private String income_other;     //其他收入
            private String social_insurance_account;     //社会保险账号
            private String social_insurance_password;     //社会保险密码
            private String accumulation_fund_account;    // 公积金账号
            private String accumulation_fund_password;    //公积金密码
            private String input_business_agent;     //录入人-业务代理人
            private String emergency_contact1_relation;     //紧急联系人1关系
            private String emergency_contact1_name;     //紧急联系人1姓名
            private String emergency_contact1_sex;    // 联系人1性别
            private String emergency_contact1_tel;     //紧急联系人1电话
            private String emergency_contact2_relation;   // 紧急联系人2关系
            private String emergency_contact2_name;     //紧急联系人2姓名
            private String emergency_contact2_sex;     //联系人性别2
            private String emergency_contact2_tel;    //紧急联系人2电话
            private String emergency_contact3_relation;     //联系人关系3
            private String emergency_contact3_name;     //联系人3姓名
            private String emergency_contact3_tel;     //联系人3性别

            public String getToken() {
                return token;
            }

            public DataBean setToken(String token) {
                this.token = token;
                return this;
            }

            public String getLenderid() {
                return lenderid;
            }

            public void setLenderid(String lenderid) {
                this.lenderid = lenderid;
            }

            public String getLender_name() {
                return lender_name;
            }

            public void setLender_name(String lender_name) {
                this.lender_name = lender_name;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getOrder_date() {
                return order_date;
            }

            public void setOrder_date(String order_date) {
                this.order_date = order_date;
            }

            public String getMaritalStatus() {
                return maritalStatus;
            }

            public void setMaritalStatus(String maritalStatus) {
                this.maritalStatus = maritalStatus;
            }

            public String getCard_num() {
                return card_num;
            }

            public void setCard_num(String card_num) {
                this.card_num = card_num;
            }

            public String getCard_address() {
                return card_address;
            }

            public void setCard_address(String card_address) {
                this.card_address = card_address;
            }

            public String getLife_province() {
                return life_province;
            }

            public void setLife_province(String life_province) {
                this.life_province = life_province;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getCard_city() {
                return card_city;
            }

            public void setCard_city(String card_city) {
                this.card_city = card_city;
            }

            public String getCard_coutry() {
                return card_coutry;
            }

            public void setCard_coutry(String card_coutry) {
                this.card_coutry = card_coutry;
            }

            public String getWork_profession() {
                return work_profession;
            }

            public void setWork_profession(String work_profession) {
                this.work_profession = work_profession;
            }

            public String getMobile_num() {
                return mobile_num;
            }

            public void setMobile_num(String mobile_num) {
                this.mobile_num = mobile_num;
            }

            public String getMobile_password() {
                return mobile_password;
            }

            public void setMobile_password(String mobile_password) {
                this.mobile_password = mobile_password;
            }

            public String getWork_company() {
                return work_company;
            }

            public void setWork_company(String work_company) {
                this.work_company = work_company;
            }

            public String getBlank_name() {
                return blank_name;
            }

            public void setBlank_name(String blank_name) {
                this.blank_name = blank_name;
            }

            public String getBlank_account() {
                return blank_account;
            }

            public void setBlank_account(String blank_account) {
                this.blank_account = blank_account;
            }

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public String getCard_province() {
                return card_province;
            }

            public void setCard_province(String card_province) {
                this.card_province = card_province;
            }

            public String getCard_city2() {
                return card_city2;
            }

            public void setCard_city2(String card_city2) {
                this.card_city2 = card_city2;
            }

            public String getBirthplace() {
                return birthplace;
            }

            public void setBirthplace(String birthplace) {
                this.birthplace = birthplace;
            }

            public String getCard_sex() {
                return card_sex;
            }

            public void setCard_sex(String card_sex) {
                this.card_sex = card_sex;
            }

            public String getCard_age() {
                return card_age;
            }

            public void setCard_age(String card_age) {
                this.card_age = card_age;
            }

            public String getEducation_status() {
                return education_status;
            }

            public void setEducation_status(String education_status) {
                this.education_status = education_status;
            }

            public String getIncome_year() {
                return income_year;
            }

            public void setIncome_year(String income_year) {
                this.income_year = income_year;
            }

            public String getIncome_other() {
                return income_other;
            }

            public void setIncome_other(String income_other) {
                this.income_other = income_other;
            }

            public String getSocial_insurance_account() {
                return social_insurance_account;
            }

            public void setSocial_insurance_account(String social_insurance_account) {
                this.social_insurance_account = social_insurance_account;
            }

            public String getSocial_insurance_password() {
                return social_insurance_password;
            }

            public void setSocial_insurance_password(String social_insurance_password) {
                this.social_insurance_password = social_insurance_password;
            }

            public String getAccumulation_fund_account() {
                return accumulation_fund_account;
            }

            public void setAccumulation_fund_account(String accumulation_fund_account) {
                this.accumulation_fund_account = accumulation_fund_account;
            }

            public String getAccumulation_fund_password() {
                return accumulation_fund_password;
            }

            public void setAccumulation_fund_password(String accumulation_fund_password) {
                this.accumulation_fund_password = accumulation_fund_password;
            }

            public String getInput_business_agent() {
                return input_business_agent;
            }

            public void setInput_business_agent(String input_business_agent) {
                this.input_business_agent = input_business_agent;
            }

            public String getEmergency_contact1_relation() {
                return emergency_contact1_relation;
            }

            public void setEmergency_contact1_relation(String emergency_contact1_relation) {
                this.emergency_contact1_relation = emergency_contact1_relation;
            }

            public String getEmergency_contact1_name() {
                return emergency_contact1_name;
            }

            public void setEmergency_contact1_name(String emergency_contact1_name) {
                this.emergency_contact1_name = emergency_contact1_name;
            }

            public String getEmergency_contact1_sex() {
                return emergency_contact1_sex;
            }

            public void setEmergency_contact1_sex(String emergency_contact1_sex) {
                this.emergency_contact1_sex = emergency_contact1_sex;
            }

            public String getEmergency_contact1_tel() {
                return emergency_contact1_tel;
            }

            public void setEmergency_contact1_tel(String emergency_contact1_tel) {
                this.emergency_contact1_tel = emergency_contact1_tel;
            }

            public String getEmergency_contact2_relation() {
                return emergency_contact2_relation;
            }

            public void setEmergency_contact2_relation(String emergency_contact2_relation) {
                this.emergency_contact2_relation = emergency_contact2_relation;
            }

            public String getEmergency_contact2_name() {
                return emergency_contact2_name;
            }

            public void setEmergency_contact2_name(String emergency_contact2_name) {
                this.emergency_contact2_name = emergency_contact2_name;
            }

            public String getEmergency_contact2_sex() {
                return emergency_contact2_sex;
            }

            public void setEmergency_contact2_sex(String emergency_contact2_sex) {
                this.emergency_contact2_sex = emergency_contact2_sex;
            }

            public String getEmergency_contact2_tel() {
                return emergency_contact2_tel;
            }

            public void setEmergency_contact2_tel(String emergency_contact2_tel) {
                this.emergency_contact2_tel = emergency_contact2_tel;
            }

            public String getEmergency_contact3_relation() {
                return emergency_contact3_relation;
            }

            public void setEmergency_contact3_relation(String emergency_contact3_relation) {
                this.emergency_contact3_relation = emergency_contact3_relation;
            }

            public String getEmergency_contact3_name() {
                return emergency_contact3_name;
            }

            public void setEmergency_contact3_name(String emergency_contact3_name) {
                this.emergency_contact3_name = emergency_contact3_name;
            }

            public String getEmergency_contact3_tel() {
                return emergency_contact3_tel;
            }

            public void setEmergency_contact3_tel(String emergency_contact3_tel) {
                this.emergency_contact3_tel = emergency_contact3_tel;
            }
        }
    }
}
