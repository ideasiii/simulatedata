{
      "Account":{
           "d_id": $Func{intRand()},
           "version": $Var{tmp}=$Func{doubleRand(0,10,2)},
           "os_type": "$Dic{ot}",
           "os": "$Var{tmp}",
           "test": "$Dic{b}",
           "中文姓": "$Func{strSurname()}",
           "中文名": "$Func{strFirstName()}",
           "姓名": "$Func{strName()}",
           "婚姻狀態": "$Dic{marital}"
      }
}