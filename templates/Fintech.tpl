{
      "Account":{
           "中文姓": $Var{surname}=$Func{strSurname()},
           "中文名": $Var{firstname}=$Func{strFirstName()},
           "姓名": "$Var{surname}$Var{firstname}",
           "別名": "$Func{strName()}",
           "婚姻狀態": "$Dic{marital}",
           "子女數": "$Dic{child}",
           "服務機構": "$Dic{job}",
           "最高學歷": "$Dic{education}",
           "年收入": "$Dic{salary}",
           "資金來源": "$Dic{source}"
      }
      
      "sample":
      {
		"d_id": $Func{intRand()},
        "version": $Var{tmp}=$Func{doubleRand(0,10,2)},
        "os_type": "$Dic{ot}",
        "os": "$Var{tmp}",
        "test": "$Dic{b}"
      }
}