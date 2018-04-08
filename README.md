### DICL Internship Program 2018

สวัสดีน้องๆที่ให้ความสนใจมาฝึกงานที่บริษัท ดิจิตอล อินไซด์เดอร์ จำกัด ในปี 2018 นี้ทุกๆคนนะครับ ก่อนที่จะเข้ามาฝึกงานกับเรา พี่มีบททดสอบเล็กน้อยเพื่อวัดทักษะพื้นฐานสำหรับนักพัฒนา Mobile Developer น้องๆไม่จำเป็นต้องตอบหรือต้องรู้ทุกเรื่องในบททดสอบนี้ เพราะเรามาสามารถมาเรียนรู้กันภายหลังได้ เพียงแต่เราอยากให้น้องๆทุกคนลองทำด้วยตัวเอง ค้นคว้าเอง ทั้งหมดก็เพื่อประโยชน์ของตัวน้องๆเองและบริษัท หากใครสนใจส่งคำตอบกันมานะได้เลยนะครับ ปิดรับสมัครวันที่ 8 เมษายน 18 เวลา 23:59 น.

## 1. Code in Swift or Java / Kotlin
แบบทดสอบนี้จะดูทักษะความรู้ความเข้าใจเกี่ยวกับเรื่อง Collection เช่น Array, Dictionary เป็นต้น

ดาวน์โหลดข้อมูล [data.json](https://github.com/memogames/dicl-intern-18/blob/master/data.json) และเขียนโค้ดเพื่อหาคำตอบ
- 1.1 หาคะแนนเฉลี่ย **score** ของนักเรียน
- 1.2 แสดงชื่อและเกรดของนักเรียนที่ได้คะแนนมากว่า 70 ขึ้นไป
- 1.3 ค้นหาชื่อนักเรียนที่มีคะแนนมากที่สุดและต่ำที่สุด **score**

คำตอบ:
```
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Pjtest {
    public static void main(String args[]){ 
    
    	JSONParser parser = new JSONParser();
        
        try {
        JSONArray data = (JSONArray) parser.parse(new FileReader("C:\\Users\\nonta\\Desktop\\workshop\\dicl-intern-18\\data.json"));  
            
    double total=0;
    ArrayList score = new ArrayList();
      
    for (Object o : data){
    JSONObject person = (JSONObject) o;   
    long s = (long) person.get("score");
    total+=s;  
  }
    System.out.println("1.1 : "+total/data.size()); 
    System.out.println("\n1.2:"); 
    
    for (Object o : data){
    JSONObject person = (JSONObject) o;   
    long s = (long) person.get("score");
    String n = (String) person.get("name");
    String g = (String) person.get("grade");
    if(s > 70){    
    System.out.println("Name : "+ n +"\tGrade : "+g +"\tScore : "+s);
    }
    score.add(s);
  }
    Collections.sort(score);
    System.out.println("\n1.3");
    System.out.println("Min : "+score.get(0) +" Max : "+score.get(score.size()-1) );
    
        }
        catch(FileNotFoundException fe){
            fe.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
```

## 2. Create Simple Mobile Application

แบบทดสอบนี้จะดูทักษะความรู้ความเข้าใจสำหรับการพัฒนาแอปพลิเคชั่น และการใช้ UI พื้นฐานของแต่ละ Platform

### Features
- GET ข้อมูล JSON จาก [movie.json](https://github.com/memogames/dicl-intern-18/blob/master/movie.json)
- แสดงรายชื่อและรูปภาพใน ListView หรือ TableView
- ผู้ใช้สามารถกดเพื่อดูข้อมูลรายละเอียดได้ในหน้าถัดไป
- ผู้ใช้สามารถแชร์ข้อมูลชื่อหนังที่สนใจให้กับเพื่อนๆได้
- ออกแบบ UI ได้ตามความต้องการ
- ใช้ Library เพิิ่มเติิมได้

### Technical
- ดาวน์โหลดข้อมูล JSON
- เครื่องมือที่ใช้ Android Studio หรือ Xcode.

## 3. Tiny Question

Q1: Firebase คืออะไร มีฟังก์ชั่นที่น้องๆชื่นชอบนอะไรบ้างและเพราะอะไร (อย่างน้อย 3 ฟังก์ชั่น)

```
A1:
```

Q2: REST API คืออะไร

```
A2:
```

Q3: หากต้องสร้างแอปพลิเคชั่น 1 ตัว เพื่อให้รองรับทั้งระบบ iOS และ Android วิิธีไหนที่น้องๆอยากเลือกใช้พัฒนาระหว่าง Native App กับ Cross Platform และเพราะอะไร 

```
A3:
```

Q4: ถ้าให้เลือกได้ 1 บ้าน น้องๆอยากอยู่บ้านไหนระหว่าง Apple , Google และ Microsoft

```
A4:
```

Q5: เวลาว่างสิ่งที่ชอบทำที่สุดคืออะไร 2 อันดับแรก

```
A5:
```

Q6: แอปพลิเคชั่นไหนบนมือถือที่ชอบที่สุดและเกียจที่สุดตั้งแต่เคยใช้งานมา (ไม่รวมเกมส์) เพราะอะไร

```
A6:
```

Q7: อะไรบ้างที่น้องๆคาดว่าจะได้รับในขณะที่ฝึกงานกับพวกเรา?

```
A7:
```

## Submitting

ให้น้องๆ fork repo นี้แล้วตอบคำถาม จากนั้นส่ง repo มาที่ อีเมลล์ memo.games@gmail.com
