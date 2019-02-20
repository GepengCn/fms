### 结构话数据格式
#### 一、	使用XML作为数据载体
#### 二、	数据分为公共数据与个性化数据两部分。
#### 三、	公共数据是文件报批单、自由行文等7中文档中的公有部分，如标题、拟稿人、拟稿时间、流程id等
#### 四、	个性化数据是不同公文的独有字段，比如流水号、校对人等字段
#### 五、	为便于解析可以优先解析公共数据。使用个性化数据以便后续个性化扩展与实现。

 | 序号 | 字段描述 | 字段名称 | 字段类型|必填|参考值|
 | ------ | ------ | ------ | ------ | ------ |------ |
 | 1 | 任务id,公文唯一标识 | taskId |字符型|是|10665|
 | 2 | 标题 | title |字符型|是|《关于XXXX的XXXX》|
 | 3 | 拟稿人 | drafter |字符型|是|使用平台登录名,比如张三的登录名:zs|
 | 4 | 拟稿人姓名 | drafterName |字符型|是|张三|
 | 5 | 拟稿时间 | draftTime |字符型|是|`yyyy-MM-dd HH:mm:ss`|
 | 6 | 公文表单ftp地址(pdf文件)| formFtp |字符型|是|`filePath:远程目录;fileName:文件名`|
 | 7 | 公文正文ftp地址)| docFtp |字符型|是|`filePath:远程目录;fileName:文件名`|
 | 8 | 附件ftp地址| attFtp |字符型|是|`filePath:远程目录;fileName:文件名`|
 | 9 | 卷皮ftp地址| coverFtp |字符型|是|`filePath:远程目录;fileName:文件名`|
 | 10 | 目录ftp地址| catalogFtp |字符型|是|`filePath:远程目录;fileName:文件名`|
 | 11 | 备考表ftp地址| refFtp |字符型|是|`filePath:远程目录;fileName:文件名`|
 | 12 | 个性化数据 | customized |字符型|是|不同公文不同字段,参考个性化字段表|
 | 13 | 文档类型 | type |int|是|0:文件报批单 1:自由行文 2:院发文|


```metadata json
{
  "customized": {
    "fF02": "FB2018000005",
    "fF03": "平件",
    "fF04": "内部",
    "fF12": "办理日期屏蔽测试",
    "fF14": "2018051835150100",
    "fF15": "2018051835150200",
    "fF30": "4577",
    "fF31": "2018/5/18",
    "fF32": "902",
    "fF36": "",
    "fF53": "办公平台",
    "refDocList": [
      {
        "fF02": "FB2018000006",
        "fF12": "有关办理日志屏蔽测试的相关资料",
        "fF30": "4576",
        "fF31": "2018/5/19",
        "fF32": "902"
      },
      {
        "fF02": "FB2018000008",
        "fF12": "有关办理日志屏蔽测试的相关资料1",
        "fF30": "4577",
        "fF31": "2018/5/20",
        "fF32": "902"
      }
    ]
  },
  "draftTime": "2019-02-20 10:14:32",
  "drafter": "zs",
  "drafterName": "张三",
  "ftpList": {
    "attFtp": {
      "fileName": "att.zip",
      "filePath": "/513f9001-a494-43d6-8de1-d0e5efaddf1d/"
    },
    "catalogFtp": {
      "fileName": "目录.pdf",
      "filePath": "/cab90ff9-bd9f-40fb-bda1-d4b7d07033dd/"
    },
    "coverFtp": {
      "fileName": "卷皮.pdf",
      "filePath": "/44373cc4-f81c-497e-86fb-d08b9948e0db/"
    },
    "docFtp": {
      "fileName": "正文.pdf",
      "filePath": "/56582b68-4c1d-48d2-aab5-a4ab0d9d0118/"
    },
    "formFtp": {
      "fileName": "表单.pdf",
      "filePath": "/7dad9768-7ef9-4b6f-809d-ad0dbf2325fa/"
    },
    "refFtp": {
      "fileName": "备考表.pdf",
      "filePath": "/e9356557-095b-4543-a352-e7a3b0c51ab0/"
    }
  },
  "taskId": "13464",
  "title": "全国政协委员马全林：保护生态就是保护民生",
  "type": 0
}


```