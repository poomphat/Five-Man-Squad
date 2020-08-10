# Five-Man-Squad
เป็นทีมพัฒนา software ในวิชา service oriented programming คณะ Tnformation Technology มหาลัย King Mongkut's Institute of Technology Ladkrabang (KMITL)

# สมาชิกในทีม
1. นายภูมิพัฒน์ วาวงศ์มูล รหัส 61070170 เป็น Project Manager
   ### หน้าที่คือ:
   ```
     - เป็นคนที่คอยนำโปรเจคมาเเบ่งเป็นงานย่อยๆตามรูปแบบงานเเละความยากง่าย
     - ลำดับความสำคัญของงานที่เเบ่งมาว่าควรเริ่มทำอันไหนก่อน
     - มอบหมายงานให้คนในทีมตามความยากง่ายเเละลำดับของงาน
     - เป็นคนนำงานของคนในทีมมารวมเป็นโปรเเกรม
    ```
2. นายรัชภัทร เพิ่มพูล รหัส 60070083 เป็น Back-end Developer
   ### หน้าที่คือ:
     ```
      - จัดการข้อมูลที่หน้าบ้านต้องการ
      - ออกแบบ database
     ```
3. นายธิติวุฒิ โพธิ์พันธุ์ รหัส 61070088 เป็น Front-end Developer
   ### หน้าที่คือ:
   ```
     - เรียกใช้APIมาแสดงให้เหมาะสม
     - ออกแบบ app ให้ใช้งานง่ายกับuser
     - ออกแบบappให้มีความน่าสนใจและเหมาะสมกับกลุ่มuser
   ```
4. นายปรัชญา เอี่ยมอำภา รหัส 61070117 เป็น Back-end Developer
   ### หน้าที่คือ:
   ```
     - จัดการข้อมูลที่หน้าบ้านต้องการใช้เเละส่งไปให้
     - ออกแบบ database ว่าต้องเก็บข้อมูลยังไงจะดึงข้อมูลยังไงให้เร็วที่สุด
     - รักษาความปลอดภัยของข้อมูล ทั้ง username password ข้อมูลเว็บไซต์ต่างๆ
     - หาก backend มีการ update ก็ต้องทำการ backup ข้อมูลเดิมเก็บไว้ และตรวจสอบให้ดีก่อนทำการ update
   ```
5. นายสรวิศ แย้มคำ รหัส 61070234 เป็น Front-end Developer
   ### หน้าที่คือ:
   ```
     - ออกแบบappให้สวยงาม เข้าใจง่าย ตรงตามกลุ่มเป้าหมาย
     - นำข้อมูลที่ได้จากback endมาแสดงผล
     - พัฒนาappให้ใช้งานได้อย่างรวดเร็ว ไร้ปัญหา
   ```
# PRODUCT
      แอปพลิเคชันที่ผู้ใช้สามารถนำรูปภาพมาลง และผู้ใช้สามารถดาวน์ โหลดรูปไปใช้ได้อย่างไม่ติดลิขสิทธิ์
  ### Features
  ```
   - ปุ่มแสดงความรู้สึก
   - บอกยอดดาวน์โหลด
   - ระบบคอมเมนท์
   - ระบบซื้อขายรูปภาพ
   - สามารถติดตามผู้ใช้คนอื่น
   - มีฟีดของคนทีเราติดตาม
   - มีการแบ่งหมวดหมู่รูปภาพและการใส่แท็ก
   - ระบบตรวจสอบความเหมาะสมของภาพ
   - เชื่อมต่อกับแอปพลิเคชันที่อื่น
   - จัดอันดับยอดดาวน์โหลด
   - ระบบโปรโมท
   - ระบบโดเนท
   ```


# JSON 
   JSON(JavaScript Object Notation) คือ Standard format อย่างหนึ่งที่เป็น text และสามารถอ่านออกได้ด้วยตาเปล่า ใช้ในการสร้าง object ขึ้นมาเพื่อส่งข้อมูลระหว่าง application หรือ Applications Program Interface (API)

## JSON มีเพื่ออะไร
   เพื่อเก็บข้อมูลรับ/ส่งข้อมูล ให้สามารถติดต่อกันระหว่างโปรแกรมหรือระบบต่างๆที่ใช้ภาษาในการสื่อสารที่ไม่เหมือนกันได้จึงใช้ json มาช่วยให้แต่ละโปรแกรมสามารถเข้าใจในแบบเดียวกันโดยสร้างodjectขึ้นมาเพื่อให้ javascript แลกเปลี่ยนข้อมูลระหว่าง app โดย format จะมีรูปแบบเป็น คู่ Key-Value หรือเป็นแบบ Array และสามารถนำมาใช้แทน XML format ได้


## ตัวแปร syntax
   JSON เป็นข้อมูลรูปแบบ text ที่มีรูปแบบที่จะเก็บข้อมูลแบบ key, value โดยการเขียนข้อมูลชนิด JSON มีรูปแบบคือ ชื่อฟิลด์ครอบด้วยเครื่องหมาย “ (double quote), เครื่องหมาย : (colon), value แล้วครอบทั้งหมดด้วยเครื่องหมายปีกกา
   #### ตัวแปรประกอบด้วย:
     - string
     - number
     - object (JSON object)
     - array
     - boolean
     - null
   #### JSON object  
      '{"name": "Kate", "pet": {"dog": "Corgi", "cat": "Persian"}}'
   #### array 
      '{"name": "Jothanan", "age": 28, "car": ["Tsubaru", "Honda"]}'

## ข้อดีข้อเสียเมื่อเทียบ กับ XML
   ### ข้อดี:
      - กระชับสั้นกว่าเมื่อเทียบกับXML
      - การประมวลผลของ JSON ทำได้ง่ายกว่า XML เนื่องจากโครงสร้างที่ซับซ้อน XML จึงใช้เวลาในการประมวลผลมากกว่า JSON
      - JSON ใช้พื้นที่ในการเก็บข้อมูลน้อยกว่า
   ### ข้อเสีย:
      - คือมีความเรียบร้อยน้อยกว่าเมื่อเทียบกับXML

