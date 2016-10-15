# ListViewInsideScrollView
scrollView包含listview，解决listview数据加载不出来的问题

listivew获取的动态数据，需要对listivew进行onMeasure计算，重写listview的onMeasure方法，来自于 http://stackoverflow.com/a/17503823/5279354 这个方案

listview scrollview混用相关问题还可以参考http://stackoverflow.com/a/19311197/5279354
