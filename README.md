1、PriorityQueue 一个基于优先级的无界优先级队列。优先级队列的元素按照其自然顺序进行排序，或者根据构造队列时提供的 Comparator 进行排序，具体取决于所使用的构造方法。

2、PriorityQueue 队列的头指排序规则最小那个元素。如果多个元素都是最小值则随机选一个。

3、PriorityQueue类在Java1.5中引入。PriorityQueue是基于优先堆的一个无界队列，这个优先队列中的元素可以默认自然排序或者通过提供的Comparator（比较器）在队列实例化的时排序。该队列不允许使用 null 元素也不允许插入不可比较的对象(没有实现Comparable接口的对象)。
 
4、PriorityQueue 是一个无界队列，但是初始的容量(实际是一个Object[], 默认为11)，随着不断向优先级队列添加元素，其容量会自动扩容(队列长度大于64。源码可知 Double size if small; else grow by 50%)，无需指定容量增加策略的细节。

5、PriorityQueue并不是线程安全队列，因为offer/poll都没有对队列进行锁定，所以，如果要拥有线程安全的优先级队列，需要额外进行加锁操作。

总结：

1>PriorityQueue是一种无界的，线程不安全的队列。

2>PriorityQueue是一种通过数组实现的，并拥有优先级的队列。

3>PriorityQueue存储的元素要求必须是可比较的对象， 如果不是就必须明确指定比较器。

