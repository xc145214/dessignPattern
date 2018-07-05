# 设计模式
---
[TOC]

## 策略模式

刘备要到江东娶老婆了，走之前诸葛亮给赵云（伴郎）三个锦囊妙计，说是按天机拆开解决棘手问题，
嘿，还别说，真是解决了大问题，搞到最后是周瑜陪了夫人又折兵呀，那咱们先看看这个场景是什么样子
的。

先说这个场景中的要素：三个妙计，一个锦囊，一个赵云，妙计是小亮同志给的，妙计是放置在锦囊
里，俗称就是锦囊妙计嘛，那赵云就是一个干活的人，从锦囊中取出妙计，执行，然后获胜

[源码](StrategyPattern/)
## 代理模式

什么是代理模式呢？我很忙，忙的没空理你，那你要找我呢就先找我的代理人吧，那代理人总要知道
被代理人能做哪些事情不能做哪些事情吧，那就是两个人具备同一个接口，代理人虽然不能干活，但是被
代理的人能干活呀。

比如西门庆找潘金莲，那潘金莲不好意思答复呀，咋办，找那个王婆做代理

[源码](ProxyPattern/)

## 单例模式

这个模式是很有意思，而且比较简单，但是我还是要说因为它使用的是如此的广泛，如此的有人缘，
单例就是单一、独苗的意思，那什么是独一份呢？你的思维是独一份，除此之外还有什么不能山寨的呢？
我们举个比较难复制的对象：皇帝

中国的历史上很少出现两个皇帝并存的时期，是有，但不多，那我们就认为皇帝是个单例模式，在这
个场景中，有皇帝，有大臣，大臣是天天要上朝参见皇帝的，今天参拜的皇帝应该和昨天、前天的一样（过
渡期的不考虑，别找茬哦），大臣磕完头，抬头一看，嗨，还是昨天那个皇帝，单例模式，绝对的单例模式。

[源码](SingletonPattern/)

## 多例模式

这种情况有没有？有！大点声，有没有？ 有！，是，确实有，就出现在明朝，那三国期间的算不算，
不算，各自称帝，各有各的地盘，国号不同。大家还记得那首诗《石灰吟》吗？作者是谁？于谦，他是被
谁杀死的？明英宗朱祁镇，对，就是那个在土木堡之变中被瓦刺俘虏的皇帝，被俘虏后，他弟弟朱祁钰当
上了皇帝，就是明景帝，估计当上皇帝后乐疯了，忘记把老哥朱祁镇削为太上皇了，我 Shit，在中国的历
史上就这个时期是有 2 个皇帝，你说这期间的大臣多郁闷，两个皇帝耶，两个精神依附对象呀。

[源码](MultitionPattern/)

## 工厂方法模式

女娲补天的故事大家都听说过吧，今天不说这个，说女娲创造人的故事，可不是“造人”的工作，这
个词被现代人滥用了。这个故事是说，女娲在补了天后，下到凡间一看，哇塞，风景太优美了，天空是湛
蓝的，水是清澈的，空气是清新的，太美丽了，然后就待时间长了就有点寂寞了，没有动物，这些看的到
都是静态的东西呀，怎么办？

别忘了是神仙呀，没有办不到的事情，于是女娲就架起了八卦炉（技术术语：建立工厂）开始创建人，
具体过程是这样的：先是泥巴捏，然后放八卦炉里烤，再扔到地上成长，但是意外总是会产生的：
第一次烤泥人，兹兹兹兹~~，感觉应该熟了，往地上一扔，biu~，一个白人诞生了，没烤熟！

第二次烤泥人，兹兹兹兹兹兹兹兹~~，上次都没烤熟，这次多烤会儿，往地上一扔，嘿，熟过头了，
黑人哪！

第三次烤泥人，兹~兹~兹~，一边烤一边看着，嘿，正正好，Perfect！优品，黄色人种！

## 抽象工厂模式

女娲造人，人是造出来了，世界时热闹了，可是低头一看，都
是清一色的类型，缺少关爱、仇恨、喜怒哀乐等情绪，人类的生命太平淡了，女娲一想，猛然一拍脑袋，
Shit！忘记给人类定义性别了，那怎么办？抹掉重来，然后就把人类重新洗牌，准备重新开始制造人类。
由于先前的工作已经花费了很大的精力做为铺垫，也不想从头开始了，那先说人类（Product 产品类）
怎么改吧，好，有了，给每个人类都加一个性别，然后再重新制造，这个问题解决了，那八卦炉怎么办？
只有一个呀，要么生产出全都是男性，要不都是女性，那不行呀，有了，把已经有了一条生产线——八卦
炉（工厂模式中的 Concrete Factory）拆开，于是女娲就使用了“八卦拷贝术”，把原先的八卦炉一个变两
个，并且略加修改，就成了女性八卦炉（只生产女性，一个具体工厂的实现类）和男性八卦炉（只生产男
性，又一个具体工厂的实现类）。

[源码](AbstractFactoryPattern/)

## 门面模式

大家都是高智商的人，都写过纸质的信件吧，比如给女朋友写情书什么的，写信的过程大家都还记得吧，先写信的内容，然后写信封，然后把信放到信封中，封好，投递到信箱中进行邮
递，这个过程还是比较简单的，虽然简单，这四个步骤都是要跑的呀，信多了还是麻烦，比如到了情人节，
为了大海捞针，给十个女孩子发情书，都要这样跑一遍，你不要累死，更别说你要发个广告信啥的，一下
子发 1 千万封邮件，那不就完蛋了？那怎么办呢？还好，现在邮局开发了一个新业务，你只要把信件的必
要信息高速我，我给你发，我来做这四个过程，你就不要管了，只要把信件交给我就成了。

[源码](FacadePattern/)

## 适配器模式

今天讲适配器模式，这个模式也很简单，你笔记本上的那个拖在外面的黑盒子就是个适配器，一般你在中国能用，在日本也能用，
虽然两个国家的的电源电压不同，中国是 220V，日本是 110V，但是这个适配器能够把这些不同的电压转换
为你需要的 36V 电压，保证你的笔记本能够正常运行，那我们在设计模式中引入这个适配器模式是不是也
是这个意思呢？是的，一样的作用，两个不同接口，有不同的实现，但是某一天突然上帝命令你把 B 接口
转换为 A 接口，怎么办？继承，能解决，但是比较傻，而且还违背了 OCP 原则，怎么办？好在我们还有适
配器模式。

[源码](AdapterPattern/)

## 模板方法模式

周三，9：00，我刚刚坐到位置，打开电脑准备开始干活。

“小三，小三，叫一下其它同事，到会议室，开会”老大跑过来吼，带着淫笑。还不等大家坐稳，老
大就开讲了,

“告诉大家一个好消息，昨天终于把牛叉模型公司的口子打开了，要我们做悍马模型，虽然是第一个
车辆模型，但是我们有能力，有信心做好，我们一定要…（中间省略 20 分钟的讲话，如果你听过领导人的
讲话，这个你应该能够续上）”

动员工作做完了，那就开始压任务了，“这次时间是非常紧张的，只有一个星期的时间，小三，你负责
在一个星期的时间把这批 10 万车模(注：车模是车辆模型的意思，不是香车美女那个车模)建设完成…”
“一个星期？这个…，是真做不完，要做分析，做模板，做测试，还要考虑扩展性、稳定性、健壮性
等，时间实在是太少了”还没等老大说完，我就急了，再不急我的小命就折在上面了！
“那这样，你只做实现，不考虑使用设计模式，扩展性等都不用考虑”老大又把我压回去了。
“不考虑设计模式？那…”

哎，领导已经布置任务了，那就开始死命的做吧，命苦不能怨政府，点背不能怪社会呀，然后就开始
准备动手做，在做之前先介绍一下我们公司的背景，我们公司是做模型生产的，做过桥梁模型、建筑模型、
机械模型，甚至是一些政府、军事的机密模型，这个不能说，就是把真实的实物按照一定的比例缩小或放
大，用于试验、分析、量化或者是销售等等，上面提到的牛叉模型公司专门销售车辆模型的公司，自己不
生产，我们公司是第一次从牛叉模型公司接单，那我怎么着也要把活干好，可时间很紧张呀，怎么办？

[源码](TemplateMethodPattern/)

## 建造者模式

又是一个周三，快要下班了，老大突然又拉住我，喜滋滋的告诉我“牛叉公司很满意我们做的模型，
又签订了一个合同，把奔驰、宝马的车辆模型都交给我我们公司制作了，不过这次又额外增加了一个新需
求：汽车的启动、停止、喇叭声音、引擎声音都有客户自己控制，他想什么顺序就什么顺序，这个没问题
吧?”。

看着老大殷切的目光，我还能说啥，肯定的点头，“没问题！”，加班加点做呗，“再苦再累就当自己二
百五 再难再险就当自己二皮脸 与君共勉！”这句话说出了我的心声。那任务是接下来，我们怎么做实现呢？
首先我们想了，奔驰、宝马都是一个产品，他们有共有的属性，牛叉公司关心的是单个模型，奔驰模
型 A 是先有引擎声音，然后再启动；奔驰模型 B 呢是先启动起来，然后再有引擎声音，这才是牛叉公司要
关关心的，那到我们老大这边呢，就是满足人家的要求，要什么顺序就立马能产生什么顺序的模型出来，
我呢就负责把老大的要求实现掉，而且还要是批量的，看不懂？没关系，继续看下去，首先由我生产出 N
多个奔驰和宝马车辆模型，这些车辆模型的都有 run 方法，但是具体到每一个模型的 run 方法可能中间的
执行任务的顺序是不同的，老大说要啥顺序，我就给啥顺序，最终客户买走后只能是既定的模型

[源码](BuilderPattern/)

## 桥梁模式

今天我要说说我自己，梦想中的我自己，我身价过亿，有两个大公司，一个是房地产公司，一个是服装制造
业，这两个公司都很赚钱，天天帮我在累加财富，其实是什么公司我倒是不关心，我关心的是是不是在赚钱，赚
了多少，这才是我关心的，我是商人呀，唯利是图是我的本性，偷税漏税是我的方法，欺上瞒下、压榨员工血汗
我是的手段嘛

[源码](BridgePattern/)

## 命令模式

今天讲命令模式，这个模式从名字上看就很简单，命令嘛，老大发命令，小兵执行就是了，确实是这个意思，
但是更深化了，用模式来描述真是是世界的命令情况。正在看这本书的你，我猜测分为两类：已经工作的和没有
工作的，先说没有工作的，那你为啥要看这本书，为了以后工作呗，只要你参见工作，你肯定会待在项目组，那
今天我们就以项目组为例子来讲述命令模式。

我是我们部门的项目经理，就是一个项目的头，在中国做项目，项目经理就是什么都要懂，什么都要管，做
好了项目经理能分到一杯羹，做不好都是你项目经理的责任，这个是绝对的，我带过太多的项目，行政命令一压
下来，那就一条道，做完做好！我们虽然是一个集团公司，但是我们部门是独立核算的，就是说呀，我们部门不
仅仅为我们集团服务，还可以为其他甲方服务，赚取更多的外快，所以俺们的工资才能是中上等。在 2007 年我
带领了一个项目，比较小，但是钱可不少，是做什么的呢？为一家旅行社建立一套内部管理系统，管理他的客户、
旅游资源、票务以及内部管理，整体上类似一个小型的 ERP 系统，门店比较多，员工也比较多，但是需求比较
明确，因为他们之前有一套自己购买的内部管理系统，这次变动部分模块基本上是翻版，而且旅行社有自己的
IT 部门，比较好相处，都是技术人员，没有交流鸿沟嘛。

这个项目的成员分工也是采用了常规的分工方式，分为需求组（Requirement Group，简称 RG）、美工
组（Page Group,简称 PG）、代码组（我们内部还有一个比较优雅的名字：逻辑实现组，这里使用大家经常称
呼的名称吧，英文缩写叫 Code Group，简称 CG），总共加上我这个项目经理正好十个人，刚开始的时候客户
（也就是旅行社，甲方）还是很乐意和我们每个组探讨，比如和需求组讨论需求，和美工讨论页面，和代码组讨
论实现，告诉他们修改这里，删除这里，增加这些等等，这是一种比较常见的甲乙方合作模式，甲方深入到乙方
的项目开发中。

[源码](CommandPattern/)

## 装饰器模式

Ladies and gentlemen,May I get your attention,Please?,Now I’m going to talk about decorator
pattern.装饰模式在中国使用的那实在是多，中国的文化是中庸文化，说话或做事情都不能太直接，需要
有技巧的，比如说话吧，你要批评一个人，你不能一上来就说你这个做的不对，那个做的不对，你要先肯
定他的成绩，表扬一下优点，然后再指出瑕疵，指出错误的地方，最后再来个激励，你修改了这些缺点后
有那些好处，比如你能带更多的小兵，到个小头目等等，否则你一上来就是一顿批评，你瞅瞅看，肯定是
不服气，顶撞甚至是直接“此处不养爷，自有养爷处”开溜哇。这是说话，那做事情也有很多，在山寨产
品流行之前，假货很是比较盛行的，我在 2002 年买了个手机，当时老板吹的是天花乱坠，承诺这个手机是
最新的，我看着也像，壳子是崭新的，包装是崭新的，没有任何瑕疵，就是比正品便宜了一大截，然后我
买了，缺钱哪，用来 3 个月，坏了，一送修，检查，说这是个新壳装旧机，我晕！拿一个旧手机的线路板，
找个新的外壳、屏幕、包装就成了新手机，装饰模式害人不浅呀！
我们不说不开心的事情，今天举一个什么例子呢？就说说我上小学的的糗事吧。我上小学的时候学习
成绩非常的差，班级上 40 多个同学，我基本上都是在排名 45 名以后，按照老师给我的定义就是“不是读
书的料”，但是我老爸管的很严格，明知道我不是这块料，还是往赶鸭子上架，每次考试完毕我都是战战兢
兢的，“竹笋炒肉”是肯定少不了的，能少点就少点吧，肉可是自己的呀。四年级期末考试考完，学校出来
个很损的招儿（这招儿现在很流行的），打印出成绩单，要家长签字，然后才能上五年级，我那个恐惧呀，
不过也就是几秒钟的时间，玩起来什么都忘记了。            
[源码](DecoratorPattern/)            
                      
                      
## 迭代器模式

周五下午，我正在看技术网站，第六感官发觉有人在身后，扭头一看，我 C，老大站在背后，赶忙站起来，
“王经理，你找我？” 我说。
“哦，在看技术呀。有个事情找你谈一下，你到我办公室来一下。” 老大说。
到老大办公室，
“是这样，刚刚我在看季报，我们每个项目的支出费用都很高，项目情况复杂，人员情况也不简单，我看着
也有点糊涂，你看，这是我们现在还在开发或者维护的 103 个项目，你能不能先把这些项目信息重新打印一份
给我，咱们好查查到底有什么问题。”老大说。
“这个好办，我马上去办”我爽快的答复道

[源码](IteratorPattern/)   

## 观察者模式

《孙子兵法》有云：“知彼知己，百战不殆；不知彼而知己，一胜一负；不
知彼，不知己，每战必殆”，那怎么才能知己知彼呢？知己是很容易的，自己的军队嘛，很容易知道，那怎
么知彼呢？安插间谍是很好的一个办法，我们今天就来讲一个间谍的故事。
韩非子大家都应该记得吧，法家的代表人物，主张建立法制社会，实施重罚制度，真是非常有远见呀，
看看现在社会在呼吁什么，建立法制化的社会，在 2000 多年前就已经提出了。大家可能还不知道，法家还
有一个非常重要的代表人物，李斯，对，就是李斯，秦国的丞相，最终被残忍的车裂的那位，李斯和韩非
子都是荀子的学生，李斯是师兄，韩非子是师弟，若干年后，李斯成为最强诸侯秦国的上尉，致力于统一
全国，于是安插了间谍到各个国家的重要人物的身边，以获取必要的信息，韩非子作为韩国的重量级人物，
身边自然没少间谍了，韩非子早饭吃的什么，中午放了几个 P，晚上在做什么娱乐，李斯都了如指掌，那可
是相隔千里！怎么做到的呢？间谍呀！

[源码](ObserverPattern/)  

##  责任链模式

中国古代对妇女制定了“三从四德”的道德规范，“三从”是指“未嫁从父、既嫁从夫、夫死从子”，
也就是说一个女性，在没有结婚的时候要听从于父亲，结了婚后听从于丈夫，丈夫死了还要听儿子的，举
个例子来说，一个女的要出去逛街，同样这样的一个请求，在她没有出嫁前她必须征得父亲的同意，出嫁
之后必须获得丈夫的许可，那丈夫死了怎么办？一般都是男的比女的死的早，还要问问儿子是否允许自己
出去逛街，估计你下边马上要问要是没有儿子怎么办？请示小叔子、侄子等等，在父系社会中，妇女只占
从属地位，现在想想中国的妇女还是比较悲惨的，逛个街还要请示来请示去，而且作为父亲、丈夫、儿子
只有两种选择：要不承担起责任来告诉她允许或不允许逛街，要不就让她请示下一个人，这是整个社会体
系的约束，应用到我们项目中就是业务规则。


[源码](ResponsibilityChainPattern/) 

 
## 访问者模式

今天天气不错，绝对是晴空万里，骄阳似火呀，好，我们今天来讲访问者模式，我们在前面讲了组合
模式和迭代器模式，通过组合模式我们能够把一个公司的人员组织机构树搭建起来，给管理带来非常大的
便利，通过迭代器模式我们可以把每一个员工都遍历一遍，看看是不是有“人去世了还在领退休金”，“拿
高工资而不干活的尸位素餐”等情况，那我们今天的要讲访问者模式是做什么用的呢？
我们公司有七百多技术人员，分布在全国各地，组织架构你在组合模式中也看到了，很常见的家长领
导型模式，每个技术人员的岗位都是固定的，你在组织机构在那棵树下，充当的是什么叶子节点都是非常
明确的，每一个员工的信息比如名字、性别、薪水等都是记录在数据库中，现在有这样一个需求，我要把
公司中的所有人员信息都打印汇报上去

[源码](VisitorPatter/) 

## 状态模式

现在城市发展很快，百万级人口的城市一堆一堆的，那其中有两个东西的发明在城市的发展中起到非
常重要的作用：一个是汽车，一个呢是...，猜猜看，是什么？是电梯！汽车让城市可以横向扩展，电梯让
城市可以纵向延伸，向空中伸展。汽车对城市的发展我们就不说了，电梯，你想想看，如果没有电梯，每
天你需要爬 10 层楼梯，你是不是会崩溃掉？建筑师设计了一个没有电梯的建筑，那投资家肯定不愿意投资，
那也是建筑师的耻辱呀，今天我们就用程序表现一下这个电梯是怎么运作的。
我们每天都在乘电梯，那我们来看看电梯有哪些动作（映射到 Java 中就是有多少方法）:开门、关门、
运行、停止，就这四个动作，好，我们就用程序来实现一下电梯的动作
