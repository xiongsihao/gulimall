





# 开发软件下载

Vagrant: linux虚拟机管理工具
https://releases.hashicorp.com/vagrant/2.2.5/vagrant_2.2.5_x86_64.msi
VirtualBox: 虚拟机创建工具
https://download.virtualbox.org/virtualbox/6.0.10/VirtualBox-6.0.10-132072-Win.exe
PowerDesigner: 数据库设计工具
http://forspeed.onlinedown.net/down/powerdesigner1029.zip 
其他软件：
https://www.lanzous.com/b015ag33e  密码:2wre

使用PowerDesigner软件可打开doc/database/数据库设计文件/gmall_数据库设计.pdm文件,查看数据库表结构设计

执行doc/database/sql文件夹下的脚本初始化数据库



# 踩坑记录

1）npm install 报错

```shell
npm ERR! code ELIFECYCLE
npm ERR! errno 1
npm ERR! chromedriver@2.27.2 install: `node install.js`
npm ERR! Exit status 1
```

- 问题原因：

chromedriver 的 zip 文件 url 的响应是 302 跳转，而在 install.js 里使用的是 Node.js 内置的 http 对象的 get 方法无法处理 302 跳转的情况；而另外一些情况下，则是因为 googleapis.com 被屏蔽了，无法获取文件。

- 解决方式：


删除之前下载 node_modules这个文件夹
在执行以下命令：

```shell
npm install chromedriver --chromedriver_cdnurl=http://cdn.npm.taobao.org/dist/chromedriver
```

2） npm run dev启动报错

```shell
 error  in ./src/assets/scss/index.scss

Module build failed: Error: Cannot find module 'node-sass'
    at Function.Module._resolveFilename (internal/modules/cjs/loader.js:636:15)
    at Function.Module._load (internal/modules/cjs/loader.js:562:25)
    at Module.require (internal/modules/cjs/loader.js:692:17)
    at require (internal/modules/cjs/helpers.js:25:18)
```

- 解决方式

执行以下命令

```shell
npm i node-sass --sass_binary_site=https://npm.taobao.org/mirrors/node-sass/
```

如果之前安装过但安装失败，需要先清理掉node-sass缓存，再执行上面的下载命令：

```shell
npm rebuild node-sass
npm uninstall node-sass
```

