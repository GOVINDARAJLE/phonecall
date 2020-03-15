# phonecall
_How to make call operation in android studio_
<br>
In calling app we have to make the call operation that jump to dial_pad & call it
<br>
# activity_main.xml
```
     <EditText
       android:id="@+id/edittext1"
       android:layout_width="300dp"
       android:layout_marginTop="200dp"
       android:layout_height="50dp"
       android:paddingLeft="20dp"
       android:inputType="phone"
       android:layout_centerHorizontal="true"
    android:hint="Enter No"
       />
    <Button
        android:id="@+id/call"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="400dp"
        android:background="@drawable/call"
        />
```
_Now We have to add Permission_
# Android-Manifest.xml
```<uses-permission android:name="android.permission.CALL_PHONE" />```
<br>
_Let's write the code to make the phone call via intent._
<br>
# MainActivity.java
```
      phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone1=editText.getText().toString();
                if (phone1.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter the no",Toast.LENGTH_SHORT).show();
                }else {
                    String s="tel:"+phone1;
                    Intent intent=new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);

                }

            }
        });
```

![Design](call.jpg)
