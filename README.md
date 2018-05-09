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