#### 一、结构话数据格式
1.	使用XML作为数据载体
2.	数据分为公共数据与个性化数据两部分。
3.	公共数据是文件报批单、自由行文等7中文档中的公有部分，如标题、拟稿人、拟稿时间、流程id等
4.	个性化数据是不同公文的独有字段，比如流水号、校对人等字段
5.	为便于解析可以优先解析公共数据。使用个性化数据以便后续个性化扩展与实现。
#### 二、公共数据字段表
 | 序号 | 字段描述 | 字段名称 | 字段类型|必填|参考值|
 | ------ | ------ | ------ | ------ | ------ |------ |
 | 1 | 任务id,公文唯一标识 | taskId |字符型|是|10665|
 | 2 | 标题 | title |字符型|是|《关于XXXX的XXXX》|
 | 3 | 拟稿人 | drafter |字符型|是|使用平台登录名,比如张三的登录名:zs|
 | 4 | 拟稿人姓名 | drafterName |字符型|是|张三|
 | 5 | 拟稿时间 | draftTime |字符型|是|`yyyy-MM-dd HH:mm:ss`|
 | 6 | FTP文件| ftpList |字符型|是|`filePath:远程目录;fileName:文件名;fileSort:顺序号(int);fileType:文件类型(int)`|
 | 7 | 经办法院 | court |数字型|是|0|
 | 8 | 个性化数据 | customized |字符型|是|不同公文不同字段,参考个性化字段表|
 | 9 | 文档类型 | type |int|是|1:文件报批单<br> 2:自由行文<br> 3:单位发文<br> 4:党组发文<br> 5:院发文<br> 6:收文登记<br> 7:阅件发送|
 | 10 | 关联文档 | refDocList |字符型|否|数组|
 | 11 | 办理详情 | handlingList |字符型|否|数组|
 | 12 | 办理状态 | handlerStatus |字符型|否|0:已办 1:已收在办 2:未收未办 3:终止 4:冻结|
 | 13 | 办理时间 | handlerTime |字符型|否|`yyyy-MM-dd hh:mm:ss`|
 | 14 | 当前办理用户 | handlerUser |字符型|否|用户姓名 如:张三|
 | 15 | 上一办理用户 | lastHandlerUser |字符型|否|用户姓名 如:张三|
 | 16 | 送达时间 | sendTime |字符型|否|`yyyy-MM-dd hh:mm:ss`|


> `json`范例如下

```metadata json
{
    "court": 0,
    "customized": {
        "fF02": "FB2019000009",
        "fF03": "平件",
        "fF12": "管理gray accord",
        "fF14": "2019030534340101",
        "fF15": "2019030534340201",
        "fF30": "4481",
        "fF31": "2019-03-05",
        "fF32": "902",
        "refDocList": [
            {
                "fF02": "FB2019000008",
                "fF12": "gray accord",
                "fF30": "4481",
                "fF31": "2019-03-05",
                "fF32": "902"
            }
        ]
    },
    "draftTime": "2019-03-12 19:11:11",
    "drafter": "400",
    "drafterName": "测试用400",
    "ftpList": [
        {
            "fileName": "51b2e468-02bf-4c8f-b35a-8a3b52a8841b.pdf",
            "filePath": "/a1f2d51c-9e26-4b3c-be63-4e201e874de6/75306c30-8294-497d-8e5e-57e0c1b1a84b",
            "fileSort": 0,
            "fileType": 0
        },
        {
            "fileName": "00fc2c7a-1b31-41d7-bf7c-2bf6b0e12d4e.pdf",
            "filePath": "/a1f2d51c-9e26-4b3c-be63-4e201e874de6/3bd74667-5195-4fce-8c21-5a44d0cec70c",
            "fileSort": 1,
            "fileType": 1
        },
        {
            "fileName": "c6da7d98-f8d2-4134-9354-9e832c5374da.pdf",
            "filePath": "/a1f2d51c-9e26-4b3c-be63-4e201e874de6/fca3eb74-79c4-441c-aba9-a1c42f939cff",
            "fileSort": 5,
            "fileType": 5
        },
        {
            "fileName": "5f76d222-636e-435b-8234-09802dd0f27f.pdf",
            "filePath": "/a1f2d51c-9e26-4b3c-be63-4e201e874de6/909669a9-1673-4b72-8a11-392ef0f1ab57",
            "fileSort": 2,
            "fileType": 2
        },
        {
            "fileName": "默认模板.doc",
            "filePath": "/a1f2d51c-9e26-4b3c-be63-4e201e874de6/1e0cc19f-da37-4e27-a04c-ba31203600f1",
            "fileSort": 3,
            "fileType": 3
        },
        {
            "filePath": "/a1f2d51c-9e26-4b3c-be63-4e201e874de6/237a0dae-5e00-4669-8611-6c43bf7bf3d9",
            "fileSort": 4,
            "fileType": 4
        }
    ],
    "handlerDetailList": [
        {
            "handlerStatus": "0",
            "handlerTime": "2019-03-05 10:35:45",
            "handlerUser": "测试用400",
            "lastHandlerUser": "测试用400",
            "sendTime": "2019-03-05 10:35:45"
        },
        {
            "handlerStatus": "0",
            "handlerTime": "2019-03-05 17:36:11",
            "handlerUser": "测试用400",
            "lastHandlerUser": "测试用400",
            "sendTime": "2019-03-05 10:35:45"
        },
        {
            "handlerStatus": "2",
            "handlerTime": "2019-03-13 10:25:30",
            "handlerUser": "唐文博",
            "lastHandlerUser": "测试用400",
            "sendTime": "2019-03-05 10:35:45"
        }
    ],
    "taskId": "290387",
    "title": "管理gray accord",
    "type": 1
}


```

#### 三、个性化字段表

![Alt text][wjbpd]
![Alt text][zyxw]
![Alt text][dwfw]
![Alt text][dzfw]
![Alt text][yfw]
![Alt text][swdj]
![Alt text][yjfs]




[wjbpd]:https://github.com/GepengCn/fms/blob/master/src/main/resources/static/png/wjbpd.png
[zyxw]:https://github.com/GepengCn/fms/blob/master/src/main/resources/static/png/zyxw.png
[dwfw]:https://github.com/GepengCn/fms/blob/master/src/main/resources/static/png/dwfw.png
[dzfw]:https://github.com/GepengCn/fms/blob/master/src/main/resources/static/png/dzfw.png
[yfw]:https://github.com/GepengCn/fms/blob/master/src/main/resources/static/png/yfw.png
[yjfs]:https://github.com/GepengCn/fms/blob/master/src/main/resources/static/png/yjfs.png
[swdj]:https://github.com/GepengCn/fms/blob/master/src/main/resources/static/png/swdj.png

