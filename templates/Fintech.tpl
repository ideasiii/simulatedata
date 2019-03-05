{
      "Account":{
           "中文姓": "$Var{surname}=$Func{strSurname()}",
           "中文名": "$Var{firstname}=$Func{strFirstName()}",
           "姓名": "$Var{surname}$Var{firstname}",
           "別名": "$Func{strName()}",
           "性別": "$Var{s}=$Dic{sex}",
           "婚姻狀態": "$Dic{marital}",
           "子女數": "$Dic{child}",
           "服務機構": "$Dic{job}",
           "最高學歷": "$Dic{education}",
           "年收入": "$Dic{salary}",
           "資金來源": "$Dic{source}",
           "E-mail": "$Func{strEmail()}",
           "任職公司": "$Func{strCompany()}",
           "公司電話": "$Func{strCompanyPhone()}",
           "使用者名稱": "$Func{strEnglistNameMan()}",
           "國籍": "$Dic{country}",
           "語系": "$Func{strLocale()}",
           "出生地": "$Var{town}=$Dic{town}",
           "出生日期": "$Func{strBirthday()}",
           "戶籍地址": "$Func{strStreet()}",
           "帳戶用途": "$Dic{usage}",
           "戶名": "$Var{surname}$Var{firstname}",
           "手機號碼":  "$Func{strMobilePhone()}",
           "抵押貸款額度": "$Dic{mortgage}",
           "是否申請金融卡非約定轉帳": "$Dic{transfer}",
           "身分證發證地點": "$Var{town}",
           "統一編號": "$Func{strUniform()}"
      }
 
}