package org.iii.simulatedata.utils;

abstract class Data
{
    final static String[] surname = {"李", "王", "張", "劉", "陳", "楊", "黃", "趙", "吳", "周", "徐", "孫",
			"馬", "朱", "胡", "郭", "何", "高", "林", "羅", "鄭", "梁", "謝", "宋", "唐", "許", "韓", "馮", "鄧",
			"曹", "彭", "曾", "肖", "田", "董", "袁", "潘", "于", "蔣", "蔡", "余", "杜", "葉", "程", "蘇", "魏",
			"呂", "丁", "任", "沈", "姚", "盧", "姜", "崔", "鍾", "譚", "陸", "汪", "范", "金", "石", "賴", "廖",
			"賈", "夏", "韋", "傅", "方", "白", "鄒", "孟", "熊", "秦", "邱", "江", "尹", "薛", "閆", "段", "雷",
			"侯", "龍", "史", "陶", "黎", "賀", "顧", "毛", "郝", "龔", "邵", "萬", "錢", "嚴", "覃", "武", "戴",
			"莫", "孔", "向", "湯"};
    
    final static String[] word = {"怡", "文", "婷", "雅", "佳", "君", "志", "嘉", "俊", "家", "宏", "偉", "明"
			, "慧", "欣", "宜", "惠", "彥", "如", "瑋", "宇", "豪", "芳", "建", "雯", "佩", "育", "柏", "凱", "智",
			"哲", "宗", "維", "銘", "傑", "淑", "玲", "冠", "穎", "玉", "翔", "瑜", "華", "廷", "孟", "政", "儀",
			"安", "仁", "郁", "涵", "子", "靜", "翰", "美", "國", "庭", "思", "軒", "珊", "賢", "珮", "瑩", "霖",
			"儒", "蓉", "正", "瑞", "鈞", "秀", "鴻", "倫", "伶", "盈", "琪", "萱", "威", "元", "佑", "信", "德",
			"立", "聖", "詩", "世", "婉", "潔", "昱", "鈺", "樺", "敏", "姿", "榮", "承", "慈", "曉", "奕", "芬",
			"書", "逸", "萍", "馨", "士", "真", "毅", "祥", "茹", "中", "筱", "琳", "菁", "弘", "良", "博", "娟",
			"慶", "芸", "勳", "依", "達", "心", "永", "恩", "韋", "成", "峰", "毓", "杰", "緯", "宛", "昌", "振",
			"璇", "麗", "于", "妤", "忠", "青", "誠", "裕", "龍", "均", "民", "淳", "貞", "旻", "容", "純", "平",
			"皓", "品", "耀", "昇", "寧", "勝", "憲", "浩", "靖", "啟", "吟", "英", "莉", "辰", "韻", "薇", "健",
			"綺", "蕙", "瑄", "仲", "秋", "秉", "群", "祐", "修", "亭", "珍", "揚", "昭", "琦", "任", "益", "源",
			"光", "詠", "玟", "景", "富", "駿", "柔", "泰", "閔", "羽", "輝", "堯", "雲", "琬", "峻", "蓁", "伊",
			"禎", "燕", "千", "易", "東", "巧", "鳳", "昀", "致", "培", "晴", "漢", "伯", "睿", "芝", "敬", "義",
			"亞", "方", "興", "翊", "清", "鈴", "筠", "玫", "一", "瓊", "隆", "丞", "倩", "麟", "晏", "岳", "湘",
			"崇", "帆", "臻", "強", "欽", "展", "沛", "雄", "尚", "雨", "晉", "名", "竹", "甫", "旭", "喬", "澤",
			"諭", "宣", "俐", "斌", "凡", "紹", "泓", "學", "筑", "甄", "舒", "坤", "謙", "梅", "若", "璋", "舜",
			"全", "琇", "遠", "奇", "俞", "芷", "映", "盛", "金", "虹", "懿", "蘭", "婕", "新", "碩", "乃", "彬",
			"仕", "媛", "融", "孝", "豐", "錦", "意", "嵐", "諺", "至", "彰", "淵", "天", "吉", "尹", "昕", "大",
			"云", "祺", "汝", "順", "瑾", "瀚", "松", "榕", "姵", "力", "又", "幸", "和", "齡", "昆", "男", "人",
			"憶", "之", "勇", "捷", "陽", "晨", "原", "以", "齊", "超", "為", "誼", "采", "雪", "朝", "鑫", "恆",
			"鵬", "菱", "兆", "長", "卉", "惟", "邦", "卿", "生", "楷", "竣", "香", "亮", "亦", "誌", "妍", "春",
			"程", "銓", "煒", "綸", "暐", "愷", "素", "其", "小", "瑛", "紋", "姍", "妮", "碧", "季", "福", "汶",
			"治", "鋒", "妙", "暉", "綾", "桂", "鼎", "勛", "晟", "叡", "禹", "星", "可", "聰", "寬", "煜", "洋",
			"億", "翎", "騰", "淇", "月", "鎮", "呈", "宥", "貴", "桓", "棋", "利", "茵", "茜", "凌", "懷", "羿",
			"寶", "妏", "岑", "岱", "麒", "瑤", "進", "璟", "屏", "嫻", "琮", "蘋", "友", "章", "侑", "念", "康",
			"蔚", "曜", "蓮", "亨", "林", "延", "森", "恬", "權", "上", "宸", "蓓", "琴", "函", "剛", "煌", "耿",
			"茂", "彤", "玄", "允", "瀅", "升", "勤", "劭", "少", "珈", "音", "介", "馥", "克", "南", "繼", "霆",
			"年", "傳", "錡", "昶", "苓", "曼", "葳", "渝", "蒨", "翠", "顯", "禮", "瑀", "百", "典", "善", "紀",
			"榆", "肇", "羚", "迪", "炳", "霈", "煥", "州", "有", "得", "賓", "皇", "道", "洲", "綱", "祖", "棠",
			"雁", "先", "紫", "霞", "重", "斐", "璿", "喻", "佐", "航", "錚", "珠", "芃", "杏", "川", "梓", "恒",
			"武", "苑", "藝", "孜", "評", "定", "然", "曄", "耕", "陵", "勻", "言", "菀", "嫺", "震", "聿", "鳴",
			"艾", "登", "希", "儷", "韶", "予", "炫", "頤", "薏", "基", "紘", "守", "葦", "堂", "棻", "歆", "能",
			"妃", "谷", "訓", "崴", "彩", "資", "陞", "珺", "山", "衡", "軍", "仰", "乙", "聲", "嬿", "加", "斯",
			"城", "熙", "海", "愛", "螢", "薰", "衍", "村", "科", "媚", "苡", "驊", "浚", "胤", "夫", "唯", "微",
			"芊", "芯", "伸", "廣", "則", "丹", "祈", "厚", "卓", "鐘", "奎", "發", "淨", "悅", "玠", "勁", "楓",
			"譽", "輔", "燁", "尉", "甯", "保", "津", "錫", "璽", "語", "鎧", "騏", "雍", "郡", "沂", "暄", "夢",
			"含", "倍", "硯", "時", "照", "業", "穗", "霓", "運", "澄", "懋", "寰", "幼", "堅", "櫻", "棟", "昊",
			"忻", "合", "縈", "楨", "京", "樹", "濬", "獻", "禾", "璧", "晶", "貝", "慕", "盟", "耘", "仙", "璁",
			"江", "行", "靈", "敦", "絜", "逢", "日", "牧", "嬋", "存", "本", "理", "徽", "顥", "令", "雋", "愉",
			"楚", "農", "閎", "相", "高", "同", "苹", "律", "茗", "沅", "譯", "經", "右", "旺", "才", "暘", "崧",
			"蒼", "衛", "晃", "恭", "魁", "姝", "議", "自", "泉", "玥", "汎", "樵", "賀", "凰", "貽", "泳", "謹",
			"葶", "萬", "殷", "炯", "蕾", "頡", "復", "娜", "涓", "財", "荃", "娥", "余", "澔", "助", "芹", "芮",
			"格", "倢", "沁", "頻", "乾", "田", "唐", "眉", "釗", "樂", "崑", "倚", "淯", "增", "珣", "飛", "琨",
			"今", "御", "芩", "稚", "弦", "鍾", "邑", "鍵", "頌", "師", "朋", "挺", "添", "潤", "璘", "慎", "端",
			"偲", "烜", "丁", "開", "秦", "昂", "濟", "霙", "曦", "惇", "向", "圻", "炘", "楠", "旗", "笙", "豫",
			"鶴", "滿", "知", "洵", "枝", "珩", "徵", "鉦", "儂", "三", "協", "丰", "濱", "常", "嫚", "嵩", "絹",
			"植", "期", "台", "翌", "貿", "岡", "銀", "洪", "連", "奐", "滋", "霜", "藍", "戎", "妘", "廉", "鑬",
			"蔓", "熹", "庚", "夙", "佾", "爾", "靚", "尊", "燦", "享", "詔", "申", "根", "臣", "嬅", "泊", "親",
			"詮", "圓", "菡", "壬", "樑", "弼", "爵", "應", "溢", "倉", "鐴", "琛", "錞", "璞", "熒", "筌", "嫣",
			"莞", "侃", "歡", "黛", "巍", "瑱", "璉", "嶸", "喜", "祿", "僑", "木", "穆", "彧", "菊", "居", "灝",
			"竺", "琁", "磊", "雙", "紅", "倪", "証", "媜", "杉", "諄", "睦", "萩", "見", "詒", "聆", "適", "淩",
			"怜", "壹", "濠", "臨", "印", "河", "紜", "賜", "樟", "咨", "禕", "偵", "鎂", "彗", "濤", "嚴", "因",
			"淞", "主", "勵", "竑", "芙", "姮", "旋", "沐", "燿", "玨", "緒", "嫈", "創", "焜", "環", "郎", "帝",
			"絢", "太", "媺", "叔", "霏", "白", "屹", "榛", "菘", "必", "久", "潁", "謀", "吾", "舟", "箴", "璨",
			"匡", "瑢", "綿", "蒂", "貫", "玹", "陳", "鉅", "蘊", "翼", "代", "憓", "琄", "詳", "艷", "荷", "倖",
			"功", "風", "禧", "池", "韓", "荏", "澐", "顗", "棨", "炎", "贊", "湧", "漪", "湄", "頎", "溱", "境",
			"琍", "溥", "瀛", "璐", "鏡", "兒", "壕", "珀", "縉", "幃", "鎔", "柄", "聯", "迺", "淙", "法", "賦",
			"嬌", "寅", "在", "詣", "猷", "範", "楹", "垣", "宴", "攸", "競", "羲", "緣", "量", "里", "舫", "躍",
			"恕", "渟", "滄", "稜", "淮", "鋐", "足", "桐", "芫", "周", "洛", "壽", "豊", "韡", "鎰", "曲", "琤",
			"瓏", "侖", "分", "策", "嬪", "橋", "玶", "韜", "紳", "園", "鉉", "聞", "菖", "夏", "瑗", "玳", "薪",
			"越", "梵", "絲", "巽", "鑑", "晁", "濃", "泱", "裴", "勃", "雰", "娸", "垂", "寒", "銜", "煦", "朱",
			"璦", "烈", "莊", "米", "熏", "堉", "觀", "堡", "繁", "官", "謦", "前", "榜", "溶", "澍", "襄", "珽",
			"鐸", "祝", "玓", "序", "水", "逵", "駒", "琡", "冬", "洳", "通", "司", "洺", "溫", "醇", "來", "巖",
			"烽", "蕎", "邵", "禪", "緻", "鵑", "岐", "塵", "而", "式", "棣", "錩", "玗", "餘", "嶽", "輯", "洧",
			"后", "記", "夆", "釧", "仟", "驛", "繹", "莘", "浤", "起", "虔", "帛", "述", "衣", "峙", "佶", "黃",
			"崙", "祁", "宓", "憬", "枚", "擎", "咸", "笛", "淋", "鍇", "材", "栩", "娉", "蒲", "壯", "迎", "劍",
			"諠", "圳", "皖", "拓", "銳", "絮", "匯", "蕓", "楊", "坪", "臺", "驥", "嗣", "煇", "慰", "作", "效",
			"再", "專", "丕", "妗", "諾", "李", "澧", "悌", "奉", "泯", "棉", "釋", "萌", "笠", "執", "庸", "臆",
			"葆", "鋼", "界", "葉", "姜", "崢", "證", "綠", "桑", "蟬", "初", "黎", "孫", "於", "鄉", "首", "杭",
			"茲", "擇", "錕", "宙", "陸", "從", "普", "築", "椿", "蒔", "祉", "炤", "膺", "樞", "張", "冰", "嫆",
			"委", "葵", "紓", "倬", "燊", "招", "肯", "菲", "勉", "阡", "徹", "朗", "蜜", "多", "顏", "樸", "辛",
			"研", "波", "湞", "與", "蕊", "女", "緹", "卜", "祚", "直", "赫", "竟", "諴", "揮", "澂", "晞", "模",
			"彙", "柳", "泠", "甲", "濰", "癸", "柱", "洸", "纓", "槿", "坊", "圭", "綜", "繡", "瓔", "絨", "統",
			"化", "旂", "瑟", "雀", "席", "石", "霽", "淼", "施", "約", "淦", "孔", "姬", "茱", "珂", "岫", "嶔",
			"讚", "教", "苾", "秩", "鐙", "弈", "崎", "畯", "積", "岷", "苗", "喨", "伍", "璠", "珞", "迦", "荻",
			"冀", "嬬", "侯", "公", "尤", "漳", "位", "礽", "府", "舉", "媄", "薈", "暖", "娣", "礎", "圃", "隚",
			"衿", "瀠", "諳", "鏞", "詞", "穩", "曙", "菽", "絃", "砡", "鶯", "禛", "剴", "望", "懌", "朕", "婧",
			"狄", "桀", "諒", "節", "劼", "俋", "引", "王", "九", "營", "莛", "薔", "己", "騫", "非", "輿", "苔",
			"員", "岩", "湛", "潭", "瀧", "嶢", "顓", "履", "囿", "昉", "識", "窈", "恂", "裔", "嶺", "濡", "揆",
			"丘", "脩", "卲", "宮", "瑭", "蝶", "筆", "諦", "將", "深", "旼", "彝", "贏", "巨", "孚", "晢", "北",
			"殿", "忞", "棓", "露", "敘", "巾", "樓", "涴", "旬", "凝", "圜", "愈", "梨", "旅", "呂", "特", "省",
			"果", "璜", "由", "竫", "旆", "造", "磬", "畇", "熠", "萃", "閣", "集", "讌", "嶧", "梧", "蔆", "覺",
			"虎", "地", "稟", "潓", "實", "讓", "陶", "港", "槐", "圖", "鋆", "皎", "訢", "精", "遙", "玎", "价",
			"優", "寓", "郅", "皆", "鎬", "浥", "罡", "嬛", "吏", "瓅", "情", "緗", "歷", "花", "吳", "好", "燈",
			"橙", "旖", "兼", "佰", "際", "字", "豔", "及", "會", "渼", "恪", "雷", "鄭", "陙", "論", "頂", "妡",
			"都", "乘", "鍠", "鋕", "許", "弋", "曾", "釆", "皜", "潮", "阜", "庠", "浦", "楙", "煖", "垚", "莆",
			"勢", "後", "蔭", "熾", "媗", "溪", "綵", "似", "圍", "軫", "劉", "也", "鈜", "蔡", "菩", "二", "峪",
			"勗", "鉞", "沿", "養", "何", "簡", "汪", "翡", "用", "舲", "央", "湖", "焄", "巡", "豈", "選", "藹",
			"錄", "鏵", "愔", "繪", "邁", "梁", "旨"};
    
    final static String[] esurname = {"Li", "wang", "zhang", "liu", "chen", "yang", "huang",
			"zhao", "wu", "zhou", "xu", "sun", "ma", "zhu", "hu", "guo", "he", "gao", "lin", "luo"
			, "zheng", "liang", "xie", "song", "tang", "xu", "han", "feng", "deng", "cao", "peng",
			"ceng", "xiao", "tian", "dong", "yuan", "pan", "yu", "jiang", "cai", "yu", "du", "ye",
			"cheng", "su", "wei", "lu", "ding", "ren", "chen", "yao", "lu", "jiang", "cui", "zhong"
			, "tan", "lu", "wang", "fan", "jin", "shi", "lai", "liao", "jia", "xia", "wei", "fu",
			"fang", "bai", "zou", "meng", "xiong", "qin", "qiu", "jiang", "yin", "xue", "yan",
			"duan", "lei", "hou", "long", "shi", "tao", "li", "he", "gu", "mao", "hao", "gong",
			"shao", "wan", "qian", "yan", "tan", "wu", "dai", "mo", "kong", "xiang", "tang"};
    
    final static String[] eword = {"Yi", "wen", "ting", "ya", "jia", "jun", "zhi", "jia", "jun",
			"jia", "hong", "wei", "ming", "hui", "xin", "yi", "hui", "yan", "ru", "wei", "yu",
			"hao", "fang", "jian", "wen", "pei", "yu", "bai", "kai", "zhi", "zhe", "zong", "wei",
			"ming", "jie", "shu", "ling", "guan", "ying", "yu", "xiang", "yu", "hua", "ting",
			"meng", "zheng", "yi", "an", "ren", "yu", "han", "zi", "jing", "han", "mei", "guo",
			"ting", "si", "xuan", "shan", "xian", "pei", "ying", "lin", "ru", "rong", "zheng",
			"rui", "jun", "xiu", "hong", "lun", "ling", "ying", "qi", "xuan", "wei", "yuan", "you"
			, "xin", "de", "li", "sheng", "shi", "shi", "wan", "jie", "yu", "yu", "hua", "min",
			"zi", "rong", "cheng", "ci", "xiao", "yi", "fen", "shu", "yi", "ping", "xin", "shi",
			"zhen", "yi", "xiang", "ru", "zhong", "xiao", "lin", "jing", "hong", "liang", "bo",
			"juan", "qing", "yun", "xun", "yi", "da", "xin", "yong", "en", "wei", "cheng", "feng",
			"yu", "jie", "wei", "wan", "chang", "zhen", "xuan", "li", "yu", "yu", "zhong", "qing",
			"cheng", "yu", "long", "jun", "min", "chun", "zhen", "min", "rong", "chun", "ping",
			"hao", "pin", "yao", "sheng", "ning", "sheng", "xian", "hao", "jing", "qi", "yin",
			"ying", "li", "chen", "yun", "wei", "jian", "qi", "hui", "xuan", "zhong", "qiu", "bing"
			, "qun", "you", "xiu", "ting", "zhen", "yang", "zhao", "qi", "ren", "yi", "yuan",
			"guang", "yong", "wen", "jing", "fu", "jun", "rou", "tai", "min", "yu", "hui", "yao",
			"yun", "wan", "jun", "zhen", "yi", "zhen", "yan", "qian", "yi", "dong", "qiao", "feng"
			, "yun", "zhi", "pei", "qing", "han", "bo", "rui", "zhi", "jing", "yi", "ya", "fang",
			"xing", "yi", "qing", "ling", "yun", "mei", "yi", "qiong", "long", "cheng", "qian",
			"lin", "yan", "yue", "xiang", "chong", "fan", "zhen", "qiang", "qin", "zhan", "pei",
			"xiong", "shang", "yu", "jin", "ming", "zhu", "fu", "xu", "qiao", "ze", "yu", "xuan",
			"li", "bin", "fan", "shao", "hong", "xue", "zhu", "zhen", "shu", "kun", "qian", "mei",
			"ruo", "zhang", "shun", "quan", "xiu", "yuan", "qi", "yu", "zhi", "ying", "sheng",
			"jin", "hong", "yi", "lan", "jie", "xin", "shuo", "nai", "bin", "shi", "yuan", "rong",
			"xiao", "feng", "jin", "yi", "lan", "yan", "zhi", "zhang", "yuan", "tian", "ji", "yin"
			, "xin", "da", "yun", "qi", "ru", "shun", "jin", "han", "song", "rong", "pei", "li",
			"you", "xing", "he", "ling", "kun", "nan", "ren", "yi", "zhi", "yong", "jie", "yang",
			"chen", "yuan", "yi", "qi", "chao", "wei", "yi", "cai", "xue", "chao", "xin", "heng",
			"peng", "ling", "zhao", "zhang", "hui", "wei", "bang", "qing", "sheng", "kai", "jun",
			"xiang", "liang", "yi", "zhi", "yan", "chun", "cheng", "quan", "wei", "lun", "wei",
			"kai", "su", "qi", "xiao", "ying", "wen", "shan", "ni", "bi", "ji", "fu", "wen", "zhi"
			, "feng", "miao", "hui", "ling", "gui", "ding", "xun", "cheng", "rui", "yu", "xing",
			"ke", "cong", "kuan", "yu", "yang", "yi", "ling", "teng", "qi", "yue", "zhen", "cheng"
			, "you", "gui", "huan", "qi", "li", "yin", "qian", "ling", "huai", "yi", "bao", "wen",
			"cen", "dai", "qi", "yao", "jin", "jing", "ping", "xian", "cong", "ping", "you",
			"zhang", "you", "nian", "kang", "wei", "yao", "lian", "heng", "lin", "yan", "sen",
			"tian", "quan", "shang", "chen", "bei", "qin", "han", "gang", "huang", "geng", "mao",
			"tong", "xuan", "yun", "ying", "sheng", "qin", "shao", "shao", "jia", "yin", "jie",
			"fu", "ke", "nan", "ji", "ting", "nian", "chuan", "qi", "chang", "ling", "man", "wei",
			"yu", "qian", "cui", "xian", "li", "yu", "bai", "dian", "shan", "ji", "yu", "zhao",
			"ling", "di", "bing", "pei", "huan", "zhou", "you", "de", "bin", "huang", "dao", "zhou"
			, "gang", "zu", "tang", "yan", "xian", "zi", "xia", "zhong", "fei", "xuan", "yu", "zuo"
			, "hang", "zheng", "zhu", "peng", "xing", "chuan", "zi", "heng", "wu", "yuan", "yi",
			"zi", "ping", "ding", "ran", "ye", "geng", "ling", "yun", "yan", "wan", "xian", "zhen"
			, "yu", "ming", "ai", "deng", "xi", "li", "shao", "yu", "xuan", "yi", "yi", "ji",
			"hong", "shou", "wei", "tang", "fen", "xin", "neng", "fei", "gu", "xun", "wai", "cai",
			"zi", "sheng", "jun", "shan", "heng", "jun", "yang", "yi", "sheng", "yan", "jia", "si"
			, "cheng", "xi", "hai", "ai", "ying", "xun", "yan", "cun", "ke", "mei", "yi", "hua",
			"jun", "yin", "fu", "wei", "wei", "qian", "xin", "shen", "guang", "ze", "dan", "qi",
			"hou", "zhuo", "zhong", "kui", "fa", "jing", "yue", "jie", "jin", "feng", "yu", "fu",
			"ye", "wei", "ning", "bao", "jin", "xi", "xi", "yu", "kai", "qi", "yong", "jun", "yi",
			"xuan", "meng", "han", "bei", "yan", "shi", "zhao", "ye", "sui", "ni", "yun", "cheng",
			"mao", "huan", "you", "jian", "ying", "dong", "hao", "xin", "he", "ying", "zhen",
			"jing", "shu", "jun", "xian", "he", "bi", "jing", "bei", "mu", "meng", "yun", "xian",
			"cong", "jiang", "xing", "ling", "dun", "jie", "feng", "ri", "mu", "chan", "cun", "ben"
			, "li", "hui", "hao", "ling", "juan", "yu", "chu", "nong", "hong", "xiang", "gao",
			"tong", "ping", "lǜ", "ming", "yuan", "yi", "jing", "you", "wang", "cai", "yang",
			"song", "cang", "wei", "huang", "gong", "kui", "shu", "yi", "zi", "quan", "yue", "fan"
			, "qiao", "he", "huang", "yi", "yong", "jin", "ting", "wan", "yin", "jiong", "lei",
			"xie", "fu", "na", "juan", "cai", "quan", "e", "yu", "hao", "zhu", "qin", "rui", "ge",
			"jie", "qin", "pin", "gan", "tian", "tang", "mei", "zhao", "le", "kun", "yi", "yu",
			"zeng", "xun", "fei", "kun", "jin", "yu", "qin", "zhi", "xian", "zhong", "yi", "jian",
			"song", "shi", "peng", "ting", "tian", "run", "lin", "shen", "duan", "cai", "xuan",
			"ding", "kai", "qin", "ang", "ji", "ying", "xi", "dun", "xiang", "qi", "xin", "nan",
			"qi", "sheng", "yu", "he", "man", "zhi", "xun", "zhi", "hang", "zheng", "zheng", "nong"
			, "san", "xie", "feng", "bin", "chang", "man", "song", "juan", "zhi", "qi", "tai", "yi"
			, "mao", "gang", "yin", "hong", "lian", "huan", "zi", "shuang", "lan", "rong", "yun",
			"lian", "jian", "man", "xi", "geng", "su", "yi", "er", "jing", "zun", "can", "xiang",
			"zhao", "shen", "gen", "chen", "hua", "po", "qin", "quan", "yuan", "han", "ren",
			"liang", "bi", "jue", "ying", "yi", "cang", "bi", "chen", "chun", "pu", "ying", "quan"
			, "yan", "guan", "kan", "huan", "dai", "wei", "zhen", "lian", "rong", "xi", "lu",
			"qiao", "mu", "mu", "yu", "ju", "ju", "hao", "zhu", "xuan", "lei", "shuang", "hong",
			"ni", "zheng", "zheng", "shan", "zhun", "mu", "qiu", "jian", "yi", "ling", "shi",
			"ling", "lian", "yi", "hao", "lin", "yin", "he", "yun", "ci", "zhang", "zi", "yi",
			"zhen", "mei", "hui", "tao", "yan", "yin", "song", "zhu", "li", "hong", "fu", "heng",
			"xuan", "mu", "yao", "jue", "xu", "ying", "chuang", "kun", "huan", "lang", "di", "xuan"
			, "tai", "mei", "shu", "fei", "bai", "yi", "zhen", "song", "bi", "jiu", "ying", "mou",
			"wu", "zhou", "zhen", "can", "kuang", "rong", "mian", "di", "guan", "xuan", "chen",
			"ju", "yun", "yi", "dai", "hui", "xuan", "xiang", "yan", "he", "xing", "gong", "feng",
			"xi", "chi", "han", "ren", "yun", "yi", "qi", "yan", "zan", "yong", "yi", "mei", "qi",
			"qin", "jing", "li", "pu", "ying", "lu", "jing", "er", "hao", "po", "Jin", "wei",
			"rong", "bing", "lian", "nai", "cong", "fa", "fu", "jiao", "yin", "zai", "yi", "you",
			"fan", "ying", "yuan", "yan", "you", "jing", "xi", "yuan", "liang", "li", "fang", "yue"
			, "shu", "ting", "cang", "leng", "huai", "hong", "zu", "tong", "yan", "zhou", "luo",
			"shou", "li", "wei", "yi", "qu", "cheng", "long", "lun", "fen", "ce", "pin", "qiao",
			"ping", "tao", "shen", "yuan", "xuan", "wen", "chang", "xia", "yuan", "dai", "xin",
			"yue", "fan", "si", "xun", "jian", "chao", "nong", "yang", "pei", "bo", "fen", "qi",
			"chui", "han", "xian", "xu", "zhu", "ai", "lie", "zhuang", "mi", "xun", "yu", "guan",
			"bao", "fan", "guan", "qing", "qian", "bang", "rong", "shu", "xiang", "ting", "duo",
			"zhu", "di", "xu", "shui", "kui", "ju", "chu", "dong", "ru", "tong", "si", "ming",
			"wen", "chun", "lai", "yan", "feng", "qiao", "shao", "chan", "zhi", "juan", "qi",
			"chen", "er", "shi", "di", "chang", "yu", "yu", "yue", "ji", "wei", "hou", "ji", "feng"
			, "chuan", "qian", "yi", "yi", "shen", "hong", "qi", "qian", "bo", "shu", "yi", "zhi",
			"ji", "huang", "lun", "qi", "mi", "jing", "mei", "qing", "xian", "di", "lin", "kai",
			"cai", "xu", "ping", "pu", "zhuang", "ying", "jian", "xuan", "zhen", "wan", "ta", "rui"
			, "xu", "hui", "yun", "yang", "ping", "tai", "ji", "si", "hui", "wei", "zuo", "xiao",
			"zai", "zhuan", "pi", "jin", "nuo", "li", "li", "ti", "feng", "min", "mian", "shi",
			"meng", "li", "zhi", "yong", "yi", "bao", "gang", "jie", "ye", "jiang", "zheng",
			"zheng", "lǜ", "sang", "chan", "chu", "li", "sun", "yu", "xiang", "shou", "hang", "zi"
			, "ze", "kun", "zhou", "lu", "cong", "pu", "zhu", "chun", "shi", "zhi", "zhao", "ying"
			, "shu", "zhang", "bing", "rong", "wei", "kui", "shu", "zhuo", "shen", "zhao", "ken",
			"fei", "mian", "qian", "che", "lang", "mi", "duo", "yan", "pu", "xin", "yan", "bo",
			"cheng", "yu", "rui", "nu", "ti", "bo", "zuo", "zhi", "he", "jing", "xian", "hui",
			"cheng", "xi", "mo", "hui", "liu", "ling", "jia", "wei", "gui", "zhu", "guang", "ying"
			, "jin", "fang", "gui", "zong", "xiu", "ying", "rong", "tong", "hua", "qi", "se", "que"
			, "xi", "shi", "ji", "miao", "shi", "yue", "gan", "kong", "ji", "zhu", "ke", "xiu",
			"qin", "zan", "jiao", "bi", "zhi", "deng", "yi", "qi", "jun", "ji", "min", "miao",
			"liang", "wu", "fan", "luo", "jia", "di", "ji", "ru", "hou", "gong", "you", "zhang",
			"wei", "reng", "fu", "ju", "mei", "hui", "nuan", "di", "chu", "pu", "tang", "jin",
			"ying", "an", "yong", "ci", "wen", "shu", "shu", "xian", "yu", "ying", "zhen", "kai",
			"wang", "yi", "zhen", "jing", "di", "jie", "liang", "jie", "jie", "yi", "yin", "wang",
			"jiu", "ying", "ting", "qiang", "ji", "qian", "fei", "yu", "tai", "yuan", "yan", "zhan"
			, "tan", "long", "yao", "zhuan", "lu", "you", "fang", "shi", "yao", "xun", "yi", "ling"
			, "ru", "kui", "qiu", "xiu", "shao", "gong", "tang", "die", "bi", "di", "jiang", "shen"
			, "min", "yi", "ying", "ju", "fu", "zhe", "bei", "dian", "min", "bang", "lu", "xu",
			"jin", "lou", "wo", "xun", "ning", "huan", "yu", "li", "lu", "lu", "te", "sheng", "guo"
			, "huang", "you", "jing", "pei", "zao", "qing", "yun", "yi", "cui", "ge", "ji", "yan",
			"yi", "wu", "ling", "jue", "hu", "de", "bing", "hui", "shi", "rang", "tao", "gang",
			"huai", "tu", "yun", "jiao", "xin", "jing", "yao", "ding", "jia", "you", "yu", "zhi",
			"jie", "hao", "yi", "gang", "huan", "li", "li", "qing", "xiang", "li", "hua", "wu",
			"hao", "deng", "cheng", "yi", "jian", "bai", "ji", "zi", "yan", "ji", "hui", "mei",
			"ke", "lei", "zheng", "chun", "lun", "ding", "xin", "dou", "cheng", "huang", "zhi",
			"xu", "yi", "ceng", "bian", "hao", "chao", "fu", "xiang", "pu", "mao", "nuan", "yao",
			"pu", "shi", "hou", "yin", "chi", "xuan", "xi", "cai", "shi", "wei", "zhen", "liu",
			"ye", "hong", "cai", "pu", "er", "yu", "xu", "yue", "yan", "yang", "he", "jian", "wang"
			, "fei", "yong", "ling", "yang", "hu", "xun", "xun", "qi", "xuan", "ai", "lu", "hua",
			"yin", "hui", "mai", "liang", "zhi"};
    final static String[] email = {"gmail.com", "hotmail.com", "yahoo.com", "aol.com", "hinet" +
			".net", "gmail.com", "yandex.com", "baidu.com", "gmail.com", "protonmail.com",
			"zoho" + ".com", "icloud.com", "mail.com", "gmail.com"};
    final static String[] company = {"台積電", "台塑化", "鴻海", "中華電", "台塑", "台化", "南亞", "大立光", "國泰金",
			"富邦金", "聯發科", "統一", "中信金", "台達電", "中鋼", "台灣大", "兆豐金", "統一超", "日月光投控", "第一金", "玉山金",
			"合庫金", "遠傳", "廣達", "華南金", "元大金", "台泥", "可成", "南亞科", "上海商銀", "和泰車", "彰銀", "台灣高鐵", "華碩",
			"遠東新", "研華", "國巨", "中租", "開發金", "台新金", "聯電", "環球晶", "正新", "和碩", "豐泰", "亞泥", "永豐金",
			"中壽", "新光金", "寶成", "光寶科", "世界", "友達", "聯詠", "群創", "華新科", "儒鴻", "瑞昱", "鴻準", "英業達", "上銀"
			, "仁寶", "億豐", "穩懋", "臺企銀", "臻鼎", "亞德客", "裕日車", "長榮航", "微星", "大聯大", "宏碁", "巨大", "聯強",
			"華邦電", "大同", "緯創", "智邦", "華新", "福懋", "力成", "興富發", "長榮", "華航", "大成鋼", "致茂", "群聯", "全家",
			"大江", "群光", "潤泰新", "美利達", "台勝科", "健鼎", "佳格", "潤泰全", "矽力", "頎邦", "台肥", "中裕", "旺宏", "譜瑞"
			, "瑞儀", "旭隼", "美食", "中美晶", "台玻", "新普", "聚陽", "中保", "佳世達", "GIS", "東元", "元太", "國際中橡",
			"為升", "藥華藥", "台中銀", "欣興", "中鼎", "大國鋼", "京城銀", "萬海", "遠東銀", "祥碩", "豐興", "鼎固", "日盛金",
			"富邦媒", "美律", "中華", "聯華", "中碳", "漢翔", "長興", "玉晶光", "川湖", "浩鼎", "京元電子", "宏達電", "和大",
			"台光電", "寶雅", "亞太電", "晶電", "遠雄", "裕隆", "中石化", "創見", "啟碁", "台郡", "技嘉", "創意", "聯亞", "精華",
			"裕融", "國票金", "葡萄王", "日友", "晟德", "大成", "聯邦銀", "華通", "三商壽", "神達", "神基", "義隆", "致伸", "建大"
			, "裕民", "龍巖", "台燿", "長虹", "永大", "安泰銀", "超豐", "嘉澤", "信驊", "國建", "南電", "東聯", "信義", "南港",
			"貿聯", "遠百", "麗豐", "台橡", "東陽", "美時", "彩晶", "樺漢", "正隆", "奇力新", "文曄", "亞光", "國喬", "士電",
			"震旦行", "神隆", "TPK", "金可", "群益證", "統一實", "聯合再生", "力旺", "聯茂", "新纖", "陽明", "鎧勝", "榮成",
			"復盛應用", "宏盛", "南紡", "禾伸堂", "東和鋼鐵", "中光電", "漢唐", "永豐餘", "東洋", "信邦", "藍天", "新日興", "百和",
			"牧德", "景碩", "華固", "合晶", "南茂", "可寧衛", "潤隆", "燁輝", "王道銀行", "華票", "群電", "統一證", "慧洋", "璟德"
			, "泰福", "智易", "精誠", "太子", "中鴻", "晶華", "嘉里大榮", "同欣電", "三陽工業", "聯成", "金寶", "網家", "敬鵬",
			"新鉅科", "康友", "盛群", "南僑", "力山", "大統益", "南帝", "嘉晶", "南寶", "三商", "神盾", "唐榮", "三星", "中磊",
			"英利", "福懋油", "中纖", "智擎", "康控", "台汽電", "耕興", "商億", "大台北", "福懋科", "錸德", "勤美", "順德", "宏全"
			, "欣銓", "世紀鋼", "新保", "台聚", "台表科", "矽創", "泰博", "卜蜂", "榮運", "正崴", "威盛", "桂盟", "崇越", "台半"
			, "台數科", "達方", "精測", "億光", "中聯資源", "瑞智", "勝一", "日勝生", "無"};
    
    final static String[] enameboy = {"Charles", "Mark", "Bill", "Vincent", "William", "Joseph",
			"James", "Henry", "Gary", "Martin", "Albert", "Kevin", "Michael", "Taylor", "Jackson",
			"Jack", "Jimmy", "Allen", "Martin", "Vincent", "Fred", "Gary", "William", "Charles",
			"Michael", "Karl", "Bob", "John", "Thomas", "Dean", "Paul", "Jack", "Brooke", "Kevin",
			"Louis", "John", "George", "Henry", "Benjamin", "Robert", "Carl", "Scott", "Tom",
			"Eddy", "Kris", "Peter", "Johnson", "Bruce", "Robert", "Peter", "Bill", "Joseph",
			"John", "Burt", "Charlie", "Elliot", "George", "Johnson", "Richard", "James", "Charles"
			, "Bruce", "David", "Nick", "Walt", "John", "Mark", "Sam", "Davis", "Neil", "Carl",
			"Lewis", "Billy", "Richard", "HowardAllen", "Johnny", "Robert", "Martin", "Jeff",
			"Paul", "Sam", "Francis", "Lewis", "Stephen", "Andy", "Scott"};
    
    final static String[] enamegirl = {"Audrey", "Beatrice", "Bernice", "Bonnie", "Camille",
			"Crystal", "Daphne", "Doris", "Erica", "Eudora", "Freda", "Gemma", "Gloria", "Hannah",
			"Isabel", "Jacqueline", "Katherine", "Kimberley", "Laura", "Leona", "Martina", "Maxine"
			, "Mirabelle", "Odelia", "Ophelia", "Pamela", "Patricia", "Queena", "Regina", "Sabina"
			, "Tiffany", "Una", "Vanessa", "Vicky", "Zenobia"};
    
    final static String[] country = {"千里達及托巴哥", "土耳其", "土庫曼", "不丹", "中非", "中華民國", "中華人民共和國", "丹麥"
			, "厄瓜多", "厄利垂亞", "巴布亞紐幾內亞", "巴西", "巴貝多", "巴拉圭", "巴林", "巴哈馬", "巴拿馬", "巴基斯坦", "日本",
			"比利時", "牙買加", "以色列", "加拿大", "加彭", "北韓", "卡達", "古巴", "史瓦濟蘭", "尼日", "尼加拉瓜", "尼泊爾",
			"布吉納法索", "瓜地馬拉", "甘比亞", "白俄羅斯", "立陶宛", "伊拉克", "伊朗", "冰島", "列支敦斯登", "匈牙利", "印度",
			"印度尼西亞", "吉布地", "吉里巴斯", "吉爾吉斯", "吐瓦魯", "多米尼克", "多明尼加共和國", "多哥", "安哥拉", "安地卡及巴布達",
			"安道爾", "衣索比亞", "西班牙", "克羅埃西亞", "利比亞", "宏都拉斯", "希臘", "沙烏地阿拉伯", "汶萊", "貝里斯", "貝南",
			"赤道幾內亞", "辛巴威", "亞美尼亞", "亞塞拜然", "坦尚尼亞", "奈及利亞", "委內瑞拉", "孟加拉", "尚比亞", "帛琉", "拉脫維亞",
			"東帝汶", "波札那", "波赫", "波蘭", "法國", "肯亞", "芬蘭", "阿拉伯聯合大公國", "阿根廷", "阿曼", "阿富汗", "阿爾及利亞",
			"阿爾巴尼亞", "保加利亞", "俄羅斯", "南非", "哈薩克", "柬埔寨", "查德", "玻利維亞", "科威特", "突尼西亞", "約旦", "美國",
			"茅利塔尼亞", "英國", "迦納", "剛果民主共和國", "剛果共和國", "哥倫比亞", "哥斯大黎加", "埃及", "挪威", "格瑞那達", "泰國",
			"海地", "烏干達", "烏克蘭", "烏拉圭", "烏茲別克", "秘魯", "索馬利亞", "索羅門群島", "紐西蘭", "納米比亞", "馬利", "馬來西亞",
			"馬其頓", "馬拉威", "馬紹爾群島", "馬達加斯加", "馬爾他", "馬爾地夫", "密克羅尼西亞聯邦", "捷克", "敘利亞", "梵蒂岡", "莫三比克",
			"荷蘭", "喀麥隆", "喬治亞", "幾內亞", "幾內亞比索", "斐濟", "斯里蘭卡", "斯洛伐克", "斯洛維尼亞", "智利", "東加", "菲律賓",
			"象牙海岸", "越南", "塞內加爾", "塞席爾", "塞爾維亞", "塔吉克斯坦", "奧地利", "愛沙尼亞", "愛爾蘭", "新加坡", "獅子山", "瑞士"
			, "瑞典", "萬那杜", "義大利", "聖文森及格瑞那丁", "聖多美普林西比", "聖克里斯多福與尼維斯", "聖馬利諾", "聖露西亞", "葉門", "葛摩",
			"葡萄牙", "維德角", "蒙古", "蒙特內哥羅", "蒲隆地", "蓋亞那", "寮國", "德國", "摩洛哥", "摩納哥", "摩爾多瓦", "模里西斯",
			"緬甸", "黎巴嫩", "墨西哥", "澳大利亞", "盧安達", "盧森堡", "諾魯", "賴比瑞亞", "賴索托", "賽普勒斯", "韓國", "薩爾瓦多",
			"薩摩亞", "羅馬尼亞", "蘇丹", "蘇利南"};
    
    final static String[] mobile = {"0910", "0911", "0912", "0919", "0921", "0928", "0932", "0933"
			, "0934", "0937", "0963", "0972", "0914", "0918", "0920", "0922", "0935", "0939",
			"0952", "0953", "0958", "0961", "0970", "0916", "0917", "0926", "0930", "0931", "0936"
			, "0954", "0955", "0960", "0913", "0915", "0925", "0927", "0938", "0924", "0929",
			"0931", "0956", "0960", "0971", "0923"};
    
    final static String[] region = {"AE", "AF", "AL", "AM", "AR", "AT", "AU", "BA", "BD", "BE",
			"BG", "BH", "BN", "BO", "BR", "BY", "BZ", "CA", "CH", "CL", "CN", "CO", "CR", "CZ",
			"DE", "DK", "DO", "DZ", "EC", "EE", "EG", "ES", "ET", "FI", "FO", "FR", "FR", "GB",
			"GE", "GL", "GR", "GT", "HK", "HN", "HR", "HU", "ID", "IE", "IL", "IN", "IN", "IN",
			"IN", "IQ", "IR", "IS", "IT", "JM", "JO", "JP", "KE", "KG", "KH", "KR", "KW", "KZ",
			"LA", "LB", "LI", "LK", "LT", "LU", "LV", "LY", "MA", "MC", "MK", "MN", "MO", "MT",
			"MV", "MX", "MY", "NG", "NI", "NL", "NO", "NP", "NZ", "OM", "PA", "PE", "PH", "PK",
			"PL", "PR", "PT", "PY", "QA", "RO", "RU", "RU", "RW", "SA", "SE", "SG", "SI", "SK",
			"SN", "SV", "SY", "TH", "TM", "TN", "TR", "TT", "TW", "UA", "US", "UY", "VE", "VN",
			"YE", "ZA", "ZA", "ZW"};
    
    final static String[] language = {"af", "am", "ar", "as", "az", "ba", "be", "bg", "bn", "bo",
			"br", "bs", "ca", "co", "cs", "cy", "da", "de", "ds", "dv", "el", "en", "es", "et",
			"eu", "fa", "fi", "fo", "fr", "fy", "ga", "gd", "gl", "gs", "gu", "ha", "he", "hi",
			"hr", "hr", "hs", "hu", "hy", "id", "ig", "ii", "is", "it", "it", "iu", "ja", "ka",
			"kk", "kl", "km", "kn", "ko", "ky", "lb", "lt", "lv", "mi", "mk", "ml", "mn", "mo",
			"mr", "ms", "ms", "mt", "nb", "ne", "nl", "nn", "ns", "oc", "or", "pa", "pl", "pr",
			"ps", "pt", "pt", "qu", "rm", "ro", "ru", "rw", "sa", "se", "si", "sk", "sl", "sm",
			"sq", "sr", "sv", "sw", "sy", "ta", "te", "tg", "th", "tk", "tn", "tr", "tt", "tz",
			"ug", "uk", "ur", "uz", "vi", "wo", "xh", "yo", "zh", "zu"};
    
    final static String[] taiwan_city = {"Changhua", "Chiayi", "Douliu", "Hsinchu", "Hualien",
			"Kaohsiung", "Keelung", "Magong", "Miaoli", "Nantou", "New Taipei", "Pingtung", "Puzi"
			, "Taibao", "Taichung", "Tainan", "Taipei", "Taitung", "Taoyuan", "Toufen", "Yilan",
			"Yuanlin", "Zhubei"};
    
    final static String[] os = {"Android", "iOS", "Windows", "Linux", "Unix", "Symbian", "Ubuntu"
			, "Blackberry", "Firefox"};
    
    final static String[] job = {"中國信託商業銀行", "製造業", "電子暨資訊相關產業", "批發零售業", "水、電、燃氣(油)供應",
			"通訊、運輸及倉儲服務業", "金融相關產業", "建築營造及不動產相關業", "法律、會計及其他專職服務業", "教育業", "政府機關及公營事業",
			"醫療、保健、生技業", "大眾傳播", "藝文及休閒娛樂服務業", "住宿、餐飲等其他服務業", "非營利組織", "其他"};
    
    final static String[] jobTitle = {"白領職員","籃領職員"};
}
