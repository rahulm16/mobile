import java.util.*;
class LATEST_MOBILES
{
public static void main(String[] args)
{
Scanner mb=new Scanner(System.in);
int st,c,l=0;
String d="|<< * >>|<< * >>|<< * >>|",s,co,a,cost="";

String IPXR=a=d+"  IPHONE XR  "+d+"\n\n"+
"\t\t\tCOST ₹76,900 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tBLACK, BLUE, CORAL, WHITE, RED & YELLOW"+
"\n2.AVAILABLE STORAGE & RAM :\t4 + 128 & 4 + 256"+
"\n3.OS & PROCESSOR          :\tiOS 12\tA12 BIONIC CHIP"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP\n\t\t\t\tSECONDARY : 7 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE"+
"\n7.BATTERY                 :\t2,942mAh"+
"\n8.DISPLAY                 :\t6.1inch Liquid Retina HD display"+
"\n9.DIMENSIONS(HxWxD)       :\t5.94 x 2.98 x 0.33"+
"\n10.SPECIAL FEATURES       :\tSIRI VOICE ASSISTANT, SPLASH, WATER & DUST RESISTANT",
IPXS=a=d+"  IPHONE XS  "+d+"\n\n"+
"\t\t\tCOST ₹99,900 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tGOLD, SILVER & SPACE GREY"+
"\n2.AVAILABLE STORAGE & RAM :\t4+128, 4+256 & 4+512"+
"\n3.OS & PROCESSOR          :\tiOS 12\tA12 BIONIC CHIP"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP+12 MP\n\t\t\t\tSECONDARY : 7 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE"+
"\n7.BATTERY                 :\t2,658mAh"+
"\n8.DISPLAY                 :\t5.8inch Super Retina HD display"+
"\n9.DIMENSIONS(HxWxD)       :\t5.65 x 2.79 x 0.30"+
"\n10.SPECIAL FEATURES       :\tSIRI VOICE ASSISTANT, SPLASH, WATER, TEA & DUST RESISTANT",
IPXSM=a=d+"  IPHONE XS MAX  "+d+"\n\n"+
"\t\t\tCOST ₹1,09,900 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tGOLD, SILVER, SPACE GREY"+
"\n2.AVAILABLE STORAGE & RAM :\t4+128, 4+256 & 4+512"+
"\n3.OS & PROCESSOR          :\tiOS 12\tA12 BIONIC CHIP"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP+12 MP\n\t\t\t\tSECONDARY : 7 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE"+
"\n7.BATTERY                 :\t3,174mAh"+
"\n8.DISPLAY                 :\t6.5inch Super Retina HD display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.20 x 3.05 x 0.30"+
"\n10.SPECIAL FEATURES       :\tSIRI VOICE ASSISTANT, SPLASH, WATER, TEA & DUST RESISTANT",
G3XL=a=d+"  GOOGLE PIXEL 3XL  "+d+"\n\n"+
"\t\t\tCOST ₹83,000 onwards"+"\n\n"+
  "1.AVAILABLE COLORS          :\tCLEARLY WHITE, NOT PINK & JUST BLACK"+
"\n2.AVAILABLE STORAGE & RAM :\t4+64 & 4+128"+
"\n3.OS & PROCESSOR          :\tAndroid Pie 9 \tQualcomm Snapdragon 845 64-bit"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP.2\n\t\t\t\tSECONDARY : 8 MP +8 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t3,430mAh"+
"\n8.DISPLAY                 :\t6.3inch QHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.22 x 3.01 x 0.31"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
PF1=a=d+"  POCO F1  "+d+"\n\n"+
"\t\t\tCOST ₹20,999 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tARMOURED EDITION, GRAPHITE BLACK, ROSSO RED & STEEL BLUE"+
"\n2.AVAILABLE STORAGE & RAM :\t6+64, 6+128 & 8+256"+
"\n3.OS & PROCESSOR          :\tMIUI 10.0 based on Android Oreo 8.1\tQualcomm Snapdragon 845"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP + 5MP.2\n\t\t\t\tSECONDARY : 20 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t4,000mAh"+
"\n8.DISPLAY                 :\t6.18inch FHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.12 x 2.96 x 0.34"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT & LIQUID COOL TECHNOLOGY",
R6P=a=d+"  REDMI 6PRO  "+d+"\n\n"+
"\t\t\tCOST ₹10,999 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tBLUE, BLACK, RED & GOLD"+
"\n2.AVAILABLE STORAGE & RAM :\t3 + 32 & 4 + 64"+
"\n3.OS & PROCESSOR          :\tMIUI 10.0 based on Android Oreo 8.1\tQualcomm Snapdragon 625"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 4.2,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP + 5MP\n\t\t\t\tSECONDARY : 5 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t4,000mAh"+
"\n8.DISPLAY                 :\t5.84inch FHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t5.87 x 2.82 x 0.34"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
OP6=a=d+"  ONEPLUS 6  "+d+"\n\n"+
"\t\t\tCOST ₹34,999 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tMIDNIGHT BLACK, MIDNIGHT BLUE, SILK WHITE & RED"+
"\n2.AVAILABLE STORAGE & RAM :\t6+64, 8+128 & 8+256"+
"\n3.OS & PROCESSOR          :\tOXYGEN OS based on Android Oreo 8.1\tQualcomm Snapdragon 845"+
"\n4.CONNECTIVITY            :\t4G, 3G, Wi-Fi, Bluetooth 5.0, NFC, GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 16 MP + 20MP.2\n\t\t\t\tSECONDARY : 16 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t3,300mAh"+
"\n8.DISPLAY                 :\t6.28inch AMOLED display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.12 x 2.96 x 0.30"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
RM2=a=d+"  REAL ME 2  "+d+"\n\n"+
  "\t\tCOST ₹9,500 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tDIAMOND BLACK & DIAMOND BLUE "+
"\n2.AVAILABLE STORAGE & RAM :\t3+32 & 4+64"+
"\n3.OS & PROCESSOR          :\tCOLOR OS 5 on Android Oreo 8.1\tQualcomm Snapdragon 450"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 4.2,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 13 MP + 2 MP \n\t\t\t\tSECONDARY : 8 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t4,230mAh"+
"\n8.DISPLAY                 :\t6.2inch FHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.15 x 2.97 x 0.32"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
OP6T=a=d+" ONEPLUS 6T  "+d+"\n\n"+
"\t\t\tCOST ₹37,999 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tMIDNIGHT BLACK & MIDNIGHT BLUE"+
"\n2.AVAILABLE STORAGE & RAM :\t6+64, 8+128 & 8+256"+
"\n3.OS & PROCESSOR          :\tOXYGEN OS based on Android Pie 9\tQualcomm Snapdragon 845"+
"\n4.CONNECTIVITY            :\t4G, 3G, Wi-Fi, Bluetooth 5.0, NFC, GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 16 MP + 20MP.2\n\t\t\t\tSECONDARY : 16 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE,SCREEN UNLOCK FINGER PRINT"+
"\n7.BATTERY                 :\t3,700mAh"+
"\n8.DISPLAY                 :\t6.41inch AMOLED display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.20 x 2.94 x 0.32"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
RM2P=a=d+"  REAL ME 2 PRO  "+d+"\n\n"+
"\t\t\tCOST ₹13,990 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tBLACK SEA, BLUE OCEAN & ICE LAKE"+
"\n2.AVAILABLE STORAGE & RAM :\t4+64, 6+128 & 8+128"+
"\n3.OS & PROCESSOR          :\tCOLOR OS 5 on Android Oreo 8.1\tQualcomm Snapdragon 660"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 16 MP + 2 MP \n\t\t\t\tSECONDARY : 16 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t3,500mAh"+
"\n8.DISPLAY                 :\t6.3inch FHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.17 x 2.91 x 0.33"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
G2XL=a=d+"  GOOGLE PIXEL 2XL  "+d+"\n\n"+
"\t\t\tCOST ₹45,499 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tCLEARLY WHITE & JUST BLACK"+
"\n2.AVAILABLE STORAGE & RAM :\t4 + 64"+
"\n3.OS & PROCESSOR          :\tAndroid Oreo 8.0.1\tQualcomm Snapdragon 835 64-bit"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP.2\n\t\t\t\tSECONDARY : 8 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t3,520mAh"+
"\n8.DISPLAY                 :\t6inch QHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.22 x 3.01 x 0.31"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
G3=a=d+"  GOOGLE PIXEL 3  "+d+"\n\n"+
"\t\t\tCOST ₹71,000 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tCLEARLY WHITE, NOT PINK & JUST BLACK"+
"\n2.AVAILABLE STORAGE & RAM :\t4+64 & 4+128"+
"\n3.OS & PROCESSOR          :\tAndroid Pie 9\tQualcomm Snapdragon 845 64-bit"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP.2\n\t\t\t\tSECONDARY : 8 MP + 8 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t2,915mAh"+
"\n8.DISPLAY                 :\t5.5inch FHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t5.73 x 2.68 x 0.31"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
RN5P=a=d+"  REDMI NOTE 5 PRO  "+d+"\n\n"+
  "\t\tCOST ₹13,999 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tBLACK, BLUE, GOLD, RED & ROSE GOLD"+
"\n2.AVAILABLE STORAGE & RAM :\t4+64 & 6+64"+
"\n3.OS & PROCESSOR          :\tMIUI 10.0 based on Android Nougat 7.1.2\tQualcomm Snapdragon 636"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP + 5MP\n\t\t\t\tSECONDARY : 20 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t4,000mAh"+
"\n8.DISPLAY                 :\t5.99inch FHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.24 x 2.96 x 0.31"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT",
SA7=a=d+"  SAMSUNG GALAXY A7  "+d+"\n\n"+
"\t\t\tCOST ₹23,990 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tBLACK, BLUE & GOLD"+
"\n2.AVAILABLE STORAGE & RAM :\t.4+64 & 6+128"+
"\n3.OS & PROCESSOR          :\tAndroid Oreo 8.0\tSamsung Exynos Octa core"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 24 mp + 5 mp + 8 MP\n\t\t\t\tSECONDARY : 24 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, SIDE FINGER PRINT"+
"\n7.BATTERY                 :\t3,300mAh"+
"\n8.DISPLAY                 :\t6inch QHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.29 x 3 x 0.29"+
"\n10.SPECIAL FEATURES       :\tBIXBY VOICE ASSISTANT, WATER RESISTANT",
N9=a=d+"  SAMSUNG GALAXY NOTE 9  "+d+"\n\n"+
"\t\t\tCOST ₹67,990 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tLAVENDER PURPLE, METALLIC COPPER, MIDNIGHT BLACK & OCEAN BLUE"+
"\n2.AVAILABLE STORAGE & RAM :\t6+128 & 8+512"+
"\n3.OS & PROCESSOR          :\tAndroid Oreo 8.0\tSamsung Exynos Octa core"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP+ 12 MP\n\t\t\t\tSECONDARY : 8 MP"+
"\n6.SECURITY                :\tIRIS SCAN, FACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t4,000mAh"+
"\n8.DISPLAY                 :\t6.4inch QHD+ SUPER AMOLED display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.37 x 3 x 0.34"+
"\n10.SPECIAL FEATURES       :\tBIXBY VOICE ASSISTANT, WATER RESISTANT, S PEN",
J6=a=d+"  SAMSUNG GALAXY J6+  "+d+"\n\n"+
"\t\t\tCOST ₹15,990 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tBLACK, BLUE & RED"+
"\n2.AVAILABLE STORAGE & RAM :\t4+64"+
"\n3.OS & PROCESSOR          :\tAndroid Oreo 8.1\tSamsung Exynos Octa core"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 4.2,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 13 mp + 5 mp\n\t\t\t\tSECONDARY : 8 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, SIDE FINGER PRINT"+
"\n7.BATTERY                 :\t3,300mAh"+
"\n8.DISPLAY                 :\t6inch HD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.35 x 3 x 0.31"+
"\n10.SPECIAL FEATURES       :\tBIXBY VOICE ASSISTANT, WATER RESISTANT",
S9=a=d+"  SAMSUNG GALAXY S9+  "+d+"\n\n"+
"\t\t\tCOST ₹64,900 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tCORAL BLUE, LILAC PURPLE & MIDNIGHT BLACK"+
"\n2.AVAILABLE STORAGE & RAM :\t1.4+64, 6+128 & 6+256"+
"\n3.OS & PROCESSOR          :\tAndroid Oreo 8.0\tSamsung Exynos 9810"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 5.0,NFC,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 12 MP+ 12 MP\n\t\t\t\tSECONDARY : 8 MP"+
"\n6.SECURITY                :\tIRIS SCAN, FACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t3,500mAh"+
"\n8.DISPLAY                 :\t6.2inch QHD+ SUPER AMOLED display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.22 x 2.90 x 0.33"+
"\n10.SPECIAL FEATURES       :\tBIXBY VOICE ASSISTANT, WATER RESISTANT, S PEN",
RM1=a=d+"  REAL ME 1  "+d+"\n\n"+
"\t\t\tCOST ₹8,990 onwards"+"\n\n"+
  "1.AVAILABLE COLORS        :\tSILVER, BLACK, DIAMOND BLACK & SOLAR RED"+
"\n2.AVAILABLE STORAGE & RAM :\t3+32, 4+64 & 6+64"+
"\n3.OS & PROCESSOR          :\tCOLOR OS 5 on Android Oreo 8.1\tOcta core"+
"\n4.CONNECTIVITY            :\t4G,3G,Wi-Fi,Bluetooth 4.2,GPS"+
"\n5.CAMERA                  :\tPRIMARY   : 13 MP \n\t\t\t\tSECONDARY : 8 MP"+
"\n6.SECURITY                :\tFACE ID, PASSCODE, FINGER PRINT"+
"\n7.BATTERY                 :\t3,410mAh"+
"\n8.DISPLAY                 :\t6.0inch FHD+ display"+
"\n9.DIMENSIONS(HxWxD)       :\t6.18 x 2.95 x 0.31"+
"\n10.SPECIAL FEATURES       :\tGOOGLE VOICE ASSISTANT, WATER RESISTANT";


String A="\t\t"+d+"BRAND HISTORY"+d+"\n\n\t\t\tAPPLE"+
"\nFOUNDER        :\tSteven Paul jobs, Stephen cary Wozniak, Ronald Wayne"+
"\nSTARTED FROM   :\t1 April 1976, Cupertino, California, United States"+
"\nFIRST GADGET   :\tApple 1 PC"+
"\nLATEST GADGET  :\tiPhone Xs, iPhone Xs MAX, iPhone XR, WATCH SERIES 4, iPad Pro & MacBook Air"+
"\nOTHER GADGETS  :\tMac Book's, PC's, Watches, iPad's",

G="\t\t"+d+"BRAND HISTORY"+d+"\n\n\t\t\tGOOGLE"+
"\nFOUNDER        :\tLarry Page & Sergey Brin"+
"\nSTARTED FROM   :\t4 September 1998, Menlo Park, California, United States"+
"\nSTARTED AS     :\tGoogle search"+
"\nLATEST GADGET  :\tPixel 3XL"+
"\nOTHER GADGETS  :\tPixel phones, Google home, Pixelbook",

R="\t\t"+d+"BRAND HISTORY"+d+"\n\n\t\t\tREDMI"+
"\nCO-FOUNDER     :\tLei Jun"+
"\nSTARTED FROM   :\t6 April, 2010"+
"\nFIRST GADGET   :\tRedmi 1s"+
"\nLATEST GADGET  :\tMi band 3, Mi TV PRO 4 series, Redmi 6pro"+
"\nOTHER GADGETS  :\tSmart bands & other ecosystem gadgets, TV's",

S="\t\t"+d+"BRAND HISTORY"+d+"\n\n\t\t\tSAMSUNG"+
"\nFOUNDER        :\tLee Byung-chul"+
"\nSTARTED FROM   :\t1 March 1938 Daegu, Japan Korea"+
"\nSTARTED AS     :\tGrocery shop"+
"\nLATEST GADGET  :\tSamsung QLED 8K TV"+
"\nOTHER GADGETS  :\tTV's, SOME ECO SYSTEM GADGETS",

OP="\t\t"+d+"BRAND HISTORY"+d+"\n\n\t\t\tONE PLUS"+
"\nFOUNDER        :\tPete Lau, Carl Pei"+
"\nSTARTED FROM   :\t16 December 2013, China"+
"\nFIRST GADGET   :\tOnePlus One"+
"\nLATEST GADGET  :\tOnePlus6T"+
"\nOTHER GADGETS  :\tSmart phones, Earphones, Power banks",

RM="\t\t"+d+"BRAND HISTORY"+d+"\n\n\t\t\tREAL ME"+
"\nFOUNDER        :\tSky Li"+
"\nSTARTED FROM   :\t4 May 2018"+
"\nFIRST GADGET   :\tRealme 1"+
"\nLATEST GADGET  :\tRealme 2PRO"+
"\nOTHER GADGETS  :\tOnly Smart phones";
System.out.println("\t\tHello, Welcome to the 'LATEST MOBILES WORLD'.\n\nHere you can select your favourite mobile and know"+ 
" it's specs, even you can compare it with other latest mobile which is your another most"+
" liked mobile.\nIf you are confused in selecting your mobile, I hope this will help you in choosing. \n\n");

System.out.println("\n\t\t\t\t\tINSTRUCTIONS:\n1.Please use the number preceding your choice for input"+"\n2.If any choice entered more than existing choices the last choice would be selected, therefore please enter correct choices");

System.out.println("\n\n\t\t"+d+" WELCOME TO ELCTRONIC MOBILE SELECTOR "+d);

System.out.println("\n\nHOW WOULD YOU LIKE TO SELECT YOUR FAVOURITE MOBILE BY SORTING IT :\n1.DISPLAY TYPE\n2.COST");
int srt=mb.nextInt();
if(srt==1)
{
System.out.println("ENTER WHICH TYPE OF MOBILE YOU WANT");
System.out.println("1.NOTCH \n2.WATER DROP NOTCH \n3.FULL SCREEN ");
int td=mb.nextInt();
switch(td)
{
case 1:
{
System.out.println("ENTER BRAND OF MOBILE YOU WANT");
System.out.println("1.APPLE \n2.GOOGLE PIXEL 3XL \n3.REDMI \n4.ONEPLUS 6 \n5.REALME 2 ");
int b=mb.nextInt();
switch(b)
{
case 1:
System.out.println("ENTER EDITION OF MOBILE");
System.out.println("1.IPHONE XR \n2.IPHONE XS \n3.IPHONE XS MAX");
int i=mb.nextInt();
{
switch(i)
{
case 1:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.4+128\n3.4+256");
st=mb.nextInt();
if(st==1)
s="4+64";
else if(st==2)
s="4+128";
else
s="4+256";

if(st==1)
cost="₹76,900";
else if(st==2)
cost="₹81,900";
else
cost="₹91,900";
System.out.println("1.BLACK \n2.BLUE \n3.CORAL \n4.WHITE \n5.RED \n6.YELLOW");
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else if(c==3)
co="CORAL";
else if(c==4)
co="WHITE";
else if(c==5)
co="RED";
else 
co="YELLOW";
l=1;
a=IPXR;
System.out.println(A+"\n");
System.out.println(IPXR+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 2:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+128 \n2.4+256 \n3.4+512");
st=mb.nextInt();
if(st==1)
s="4+128";
else if(st==2)
s="4+256";
else
s="4+512";

if(st==1)
cost="₹99,900";
else if(st==2)
cost="₹1,14,900";
else
cost="₹1,34,900";
System.out.println("1.GOLD \n2.SILVER \n3.SPACE GREY");
c=mb.nextInt();
if(c==1)
co="GOLD";
else if(c==2)
co="SILVER";
else 
co="SPACE GREY";
l=2;
a=IPXS;
System.out.println(A+"\n");
System.out.println(IPXS+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 3:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+128 \n2.4+256 \n3.4+512");
st=mb.nextInt();
if(st==1)
s="4+128";
else if(st==2)
s="4+256";
else
s="4+512";

if(st==1)
cost="₹1.09,900";
else if(st==2)
cost="₹1,24,900";
else
cost="₹1,44,900";
System.out.println("1.GOLD \n2.SILVER \n3.SPACE GREY");
c=mb.nextInt();
if(c==1)
co="GOLD";
else if(c==2)
co="SILVER";
else 
co="SPACE GREY";
l=3;
a=IPXSM;
System.out.println(A+"\n");
System.out.println(IPXSM+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
}
break;
}
case 2:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.4+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="4+128";

if(st==1)
cost="₹83,000";
else
cost="₹92,000";
System.out.println("1.CLEARLY WHITE \n2.NOT PINK \n3.JUST BLACK");
c=mb.nextInt();
if(c==1)
co="CLEARLY WHITE";
else if(c==2)
co="NOT PINK";
else 
co="JUST BLACK";
l=4;
a=G3XL;
System.out.println(G+"\n");
System.out.println(G3XL+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 3:
{
System.out.println("ENTER EDITION OF MOBILE");
System.out.println("1.POCO F1 \n2.REDMI 6PRO");
int r=mb.nextInt();
{
switch(r)
{
case 1:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+64 \n2.6+128 \n3.8+256");
st=mb.nextInt();
if(st==1)
s="6+64";
if(st==2)
s="6+128";
else
s="8+256";

if(st==1)
cost="₹20,999";
else if(st==2)
cost="₹23,999";
else
cost="₹28,999";
System.out.println("1.ARMOURED EDITION \n2.GRAPHITE BLACK \n3.ROSSO RED \n4.STEEL BLUE");
c=mb.nextInt();
if(c==1)
co="ARMOURED EDITION";
else if(c==2)
co="GRAPHITE BLACK";
else if(c==3)
co="ROSSO RED";
else
co="STEEL BLUE";
l=5;
a=PF1;
System.out.println(R+"\n");
System.out.println(PF1+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 2:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.3+32 \n2.4+64");
st=mb.nextInt();
if(st==1)
s="3+32";
else
s="4+64";

if(st==1)
cost="₹10,999";
else
cost="₹12,999";

System.out.println("1.BLUE \n2.BLACK \n3.RED \n4.GOLD");
c=mb.nextInt();
if(c==1)
co="BLUE";
else if(c==2)
co="BLACK";
else if(c==3)
co="RED";
else 
co="GOLD";
l=6;
a=R6P;
System.out.println(R+"\n");
System.out.println(R6P+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
}
}
}
break;
case 4:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+64 \n2.8+128 \n3.8+256");
st=mb.nextInt();
if(st==1)
s="6+64";
if(st==2)
s="8+128";
else
s="8+256";

if(st==1)
cost="₹34,999";
else if(st==2)
cost="₹39,999";
else
cost="₹43,999";
System.out.println("1.MIDNIGHT BLACK \n2.MIDNIGHT BLUE \n3.SILK WHITE \n4.RED");
c=mb.nextInt();
if(c==1)
co="MIDNIGHT BLACK";
else if(c==2)
co="MIDNIGHT BLUE";
else if(c==3)
co="SILK WHITE";
else
co="RED";
l=7;
a=OP6;
System.out.println(OP+"\n");
System.out.println(OP6+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break;
case 5:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.3+32 \n2.4+64");
st=mb.nextInt();
if(st==1)
s="3+32";
else
s="4+64";

if(st==1)
cost="₹9,500";
else
cost="₹10,990";
System.out.println("1.DIAMOND BLACK \n2.DIAMOND BLUE");
c=mb.nextInt();
if(c==1)
co="DIAMOND BLACK";
else
co="DIAMOND BLUE";
l=8;
a=RM2;
System.out.println(RM+"\n");
System.out.println(RM2+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
}
}
break;
case 2:
{
System.out.println("ENTER BRAND OF MOBILE");
System.out.println("1.ONE PLUS 6T \n2.REALME 2PRO");
int wdn=mb.nextInt();
{
switch(wdn)
{
case 1:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+64 \n2.8+128 \n3.8+256");
st=mb.nextInt();
if(st==1)
s="6+64";
if(st==2)
s="8+128";
else
s="8+256";

if(st==1)
cost="₹37,999";
else if(st==2)
cost="₹41,999";
else
cost="₹45,999";
System.out.println("1.MIDNIGHT BLACK \n2.MIDNIGHT BLUE");
c=mb.nextInt();
if(c==1)
co="MIDNIGHT BLACK";
else 
co="MIDNIGHT BLUE";
l=9;
a=OP6T;
System.out.println(OP+"\n");
System.out.println(OP6T+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break;
case 2:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+128 \n3.8+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else if(st==2)
s="6+128";
else
s="8+128";

if(st==1)
cost="₹13,990";
else if(st==2)
cost="₹15,990";
else
cost="₹17,990";
System.out.println("1.BLACK SEA \n2.BLUE OCEAN \n3.ICE LAKE");
c=mb.nextInt();
if(c==1)
co="BLACK SEA";
else if(c==2)
co="BLUE OCEAN";
else 
co="ICE LAKE";
l=10;
a=RM2P;
System.out.println(RM+"\n");
System.out.println(RM2P+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
}
}
}
break ;
case 3:
{
System.out.println("ENTER BRAND OF MOBILE");
System.out.println("1.GOOGLE PIXEL \n2.REDMI NOTE 5PRO \n3.SAMSUNG \n4.REALME 1");
int fs=mb.nextInt();
switch(fs)
{
case 1:
{
System.out.println("ENTER EDITION OF MOBILE");
System.out.println("1.PIXEL 3 \n2.PIXEL 2XL");
int p=mb.nextInt();
switch(p)
{
case 1:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.4+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="4+128";

if(st==1)
cost="₹71,000";
else
cost="₹80,000";
System.out.println("1.CLEARLY WHITE \n2.NOT PINK \n3.JUST BLACK");
c=mb.nextInt();
if(c==1)
co="CLEARLY WHITE";
else if(c==2)
co="NOT PINK";
else 
co="JUST BLACK";
l=11;
a=G3;
System.out.println(G+"\n");
System.out.println(G3+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 2:
{
System.out.println("1.CLEARLY WHITE \n2.JUST BLACK");
cost="45,499";
c=mb.nextInt();
if(c==1)
co="BLACK & WHITE";
else 
co="JUST BLACK";
l=12;
a=G2XL;
System.out.println(G+"\n");
System.out.println(G2XL+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t4 + 64"+"\n\n\n"+"COST                      :\t"+cost);
}
}
}
break ;
case 2:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+64");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="6+64";

if(st==1)
cost="₹13,999";
else
cost="₹15,999";
System.out.println("1.BLACK \n2.BLUE \n3.GOLD \n4.RED \n5.ROSE GOLD");
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else if(c==3)
co="GOLD";
else if(c==4) 
co="RED";
else
co="ROSE GOLD";
l=13;
a=RN5P;
System.out.println(R+"\n");
System.out.println(RN5P+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 3:
{
System.out.println("ENTER EDITION OF MOBILE");
System.out.println("1.GALAXY A7 \n2.NOTE 9 \n3.GALAXY J6+ \n4.s9+");
int sa=mb.nextInt();
switch(sa)
{
case 1:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="6+128";

if(st==1)
cost="₹23,990";
else
cost="₹28,990";
System.out.println("1.BLACK \n2.BLUE \n3.GOLD ");
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else 
co="GOLD";
l=14;
a=SA7;
System.out.println(S+"\n");
System.out.println(SA7+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 2:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+128\n2.8+512");
st=mb.nextInt();
if(st==1)
s="6+128";
else
s="8+512";

if(st==1)
cost="₹67,990";
else
cost="₹84,990";
System.out.println("1.LAVENDER PURPLE \n2.METALLIC COPPER \n3.MIDNIGHT BLACK \n4.OCEAN BLUE");
c=mb.nextInt();
if(c==1)
co="LAVENDER PURPLE";
else if(c==2)
co="METALLIC COPPER";
else if(c==3)
co="MIDNIGHT BLACK";
else 
co="OCEAN BLUE";
l=15;
a=N9;
System.out.println(S+"\n");
System.out.println(N9+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;
case 3:
{
System.out.println("1.BLACK \n2.BLUE \n3.RED");
cost="15,990";
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else 
co="RED";
l=16;
a=J6;
System.out.println(S+"\n");
System.out.println(J6+"\n11.STORAGE & RAM          :\t4 + 64\n12.COLOR                  :\t"+co+"\n\n\n"+"COST                      :\t"+cost);
}
break;
case 4:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+128 \n3.6+256");
st=mb.nextInt();
if(st==1)
s="4+64";
else if(st==2)
s="6+128";
else
s="6+256";

if(st==1)
cost="₹64,900";
else if(st==2)
cost="₹68,900";
else
cost="₹68,999";
System.out.println("1.CORAL BLUE \n2.LILAC PURPLE \n3.MIDNIGHT BLACK");
c=mb.nextInt();
if(c==1)
co="CORAL BLUE";
else if(c==2)
co="LILAC PURPLE";
else
co="MIDNIGHT BLACK";
l=17;
a=S9;
System.out.println(S+"\n");
System.out.println(S9+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
}
}
break ;
case 4:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.3+32 \n2.4+64 \n3.6+64");
st=mb.nextInt();
if(st==1)
s="3+32";
else if(st==2)
s="4+64";
else
s="6+64";

if(st==1)
cost="₹8,990";
else if(st==2)
cost="₹10,490";
else
cost="₹12,990";
System.out.println("1.SILVER \n2.BLACK \n3.DIAMOND BLACK \n4.SOLAR RED");
c=mb.nextInt();
if(c==1)
co="SILVER";
else if(c==2)
co="BLACK";
else if(c==3)
co="DIAMOND BLACK";
else
co="SOLAR RED";
l=18;
a=RM1;
System.out.println(RM+"\n");
System.out.println(RM1+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
}
}
}
}


else
{
System.out.println("MOBILES ARE SORTED BY PRICE LOWER TO HIGHER\n");
System.out.println("1.REAL ME 1\n2.REAL ME 2\n3.REDMI 6PRO\n4.REALME 2PRO\n5.REDMI NOTE 5 PRO\n6.SAMSUNG GALAXY J6+"+
"\n7.POCO F1\n8.SAMSUNG GALAXY A7"+"\n9.ONEPLUS 6\n10.ONE PLUS 6T\n11.GOOGLE PIXEL 2XL\n12.SAMSUNG GALAXY S9+"+
"\n13.SAMSUNG GALAXY NOTE 9\n14.IPHONE XR\n15.GOOGLE PIXEL 3\n16.GOOGLE PIXEL 3XL\n17.IPHONE XS\n18.IPHONE XS MAX");
int psrt=mb.nextInt();
switch(psrt)
{
case 1:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.3+32 \n2.4+64 \n3.6+64");
st=mb.nextInt();
if(st==1)
s="3+32";
else if(st==2)
s="4+64";
else
s="6+64";

if(st==1)
cost="₹8,990";
else if(st==2)
cost="₹10,490";
else
cost="₹12,990";
System.out.println("1.SILVER \n2.BLACK \n3.DIAMOND BLACK \n4.SOLAR RED");
c=mb.nextInt();
if(c==1)
co="SILVER";
else if(c==2)
co="BLACK";
else if(c==3)
co="DIAMOND BLACK";
else
co="SOLAR RED";
l=18;
a=RM1;
System.out.println(RM+"\n");
System.out.println(RM1+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 2:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.3+32 \n2.4+64");
st=mb.nextInt();
if(st==1)
s="3+32";
else
s="4+64";

if(st==1)
cost="₹9,500";
else
cost="₹10,990";
System.out.println("1.DIAMOND BLACK \n2.DIAMOND BLUE");
c=mb.nextInt();
if(c==1)
co="DIAMOND BLACK";
else
co="DIAMOND BLUE";
l=8;
a=RM2;
System.out.println(RM+"\n");
System.out.println(RM2+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 3:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.3+32 \n2.4+64");
st=mb.nextInt();
if(st==1)
s="3+32";
else
s="4+64";

if(st==1)
cost="₹10,999";
else
cost="₹12,999";
System.out.println("1.BLUE \n2.BLACK \n3.RED \n4.GOLD");
c=mb.nextInt();
if(c==1)
co="BLUE";
else if(c==2)
co="BLACK";
else if(c==3)
co="RED";
else 
co="GOLD";
l=6;
a=R6P;
System.out.println(R+"\n");
System.out.println(R6P+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break;

case 4:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+128 \n3.8+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else if(st==2)
s="6+128";
else
s="8+128";

if(st==1)
cost="₹13,990";
else if(st==2)
cost="₹15,990";
else
cost="₹17,990";
System.out.println("1.BLACK SEA \n2.BLUE OCEAN \n3.ICE LAKE");
c=mb.nextInt();
if(c==1)
co="BLACK SEA";
else if(c==2)
co="BLUE OCEAN";
else 
co="ICE LAKE";
l=10;
a=RM2P;
System.out.println(RM+"\n");
System.out.println(RM2P+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 5:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+64");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="6+64";

if(st==1)
cost="₹13,999";
else
cost="₹15,999";
System.out.println("1.BLACK \n2.BLUE \n3.GOLD \n4.RED \n5.ROSE GOLD");
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else if(c==3)
co="GOLD";
else if(c==4) 
co="RED";
else
co="ROSE GOLD";
l=13;
a=RN5P;
System.out.println(R+"\n");
System.out.println(RN5P+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 6:
{
System.out.println("1.BLACK \n2.BLUE \n3.RED");
cost="15,990";
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else 
co="RED";
l=16;
a=J6;
System.out.println(S+"\n");
System.out.println(J6+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t4 + 64+"+"\n\n\n"+"COST                      :\t"+cost);
}
break;

case 7:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+64 \n2.6+128 \n3.8+256");
st=mb.nextInt();
if(st==1)
s="6+64";
if(st==2)
s="6+128";
else
s="8+256";

if(st==1)
cost="₹20,999";
else if(st==2)
cost="₹23,999";
else
cost="₹28,999";
System.out.println("1.ARMOURED EDITION \n2.GRAPHITE BLACK \n3.ROSSO RED \n4.STEEL BLUE");
c=mb.nextInt();
if(c==1)
co="ARMOURED EDITION";
else if(c==2)
co="GRAPHITE BLACK";
else if(c==3)
co="ROSSO RED";
else
co="STEEL BLUE";
l=5;
a=PF1;
System.out.println(R+"\n");
System.out.println(PF1+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break;

case 8:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="6+128";

if(st==1)
cost="₹23,990";
else
cost="₹28,990";
System.out.println("1.BLACK \n2.BLUE \n3.GOLD ");
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else 
co="GOLD";
l=14;
a=SA7;
System.out.println(S+"\n");
System.out.println(SA7+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break;

case 9:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+64 \n2.8+128 \n3.8+256");
st=mb.nextInt();
if(st==1)
s="6+64";
if(st==2)
s="8+128";
else
s="8+256";

if(st==1)
cost="₹34,999";
else if(st==2)
cost="₹39,999";
else
cost="₹43,999";
System.out.println("1.MIDNIGHT BLACK \n2.MIDNIGHT BLUE \n3.SILK WHITE \n4.RED");
c=mb.nextInt();
if(c==1)
co="MIDNIGHT BLACK";
else if(c==2)
co="MIDNIGHT BLUE";
else if(c==3)
co="SILK WHITE";
else
co="RED";
l=7;
a=OP6;
System.out.println(OP+"\n");
System.out.println(OP6+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break;

case 10:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+64 \n2.8+128 \n3.8+256");
st=mb.nextInt();
if(st==1)
s="6+64";
if(st==2)
s="8+128";
else
s="8+256";

if(st==1)
cost="₹37,999";
else if(st==2)
cost="₹41,999";
else
cost="₹45,999";
System.out.println("1.MIDNIGHT BLACK \n2.MIDNIGHT BLUE");
c=mb.nextInt();
if(c==1)
co="MIDNIGHT BLACK";
else 
co="MIDNIGHT BLUE";
l=9;
a=OP6T;
System.out.println(OP+"\n");
System.out.println(OP6T+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 11:
{
System.out.println("1.CLEARLY WHITE \n2.JUST BLACK");
cost="45,499";
c=mb.nextInt();
if(c==1)
co="BLACK & WHITE";
else 
co="JUST BLACK";
l=12;
a=G2XL;
System.out.println(G+"\n");
System.out.println(G2XL+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t4 + 64"+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 12:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.6+128 \n3.6+256");
st=mb.nextInt();
if(st==1)
s="4+64";
else if(st==2)
s="6+128";
else
s="6+256";

if(st==1)
cost="₹64,900";
else if(st==2)
cost="₹68,900";
else
cost="₹68,999";
System.out.println("1.CORAL BLUE \n2.LILAC PURPLE \n3.MIDNIGHT BLACK");
c=mb.nextInt();
if(c==1)
co="CORAL BLUE";
else if(c==2)
co="LILAC PURPLE";
else
co="MIDNIGHT BLACK";
l=17;
a=S9;
System.out.println(S+"\n");
System.out.println(S9+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 13:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.6+128\n2.8+512");
st=mb.nextInt();
if(st==1)
s="6+128";
else
s="8+512";

if(st==1)
cost="₹67,990";
else
cost="₹84,990";
System.out.println("1.LAVENDER PURPLE \n2.METALLIC COPPER \n3.MIDNIGHT BLACK \n4.OCEAN BLUE");
c=mb.nextInt();
if(c==1)
co="LAVENDER PURPLE";
else if(c==2)
co="METALLIC COPPER";
else if(c==3)
co="MIDNIGHT BLACK";
else 
co="OCEAN BLUE";
l=15;
a=N9;
System.out.println(S+"\n");
System.out.println(N9+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 14:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+128 \n2.4+256");
st=mb.nextInt();
if(st==1)
s="4+128";
else
s="4+256";

if(st==1)
cost="₹76,900";
else if(st==2)
cost="₹81,900";
else
cost="₹91,900";
System.out.println("1.BLACK \n2.BLUE \n3.CORAL \n4.WHITE \n5.RED \n6.YELLOW");
c=mb.nextInt();
if(c==1)
co="BLACK";
else if(c==2)
co="BLUE";
else if(c==3)
co="CORAL";
else if(c==4)
co="WHITE";
else if(c==5)
co="RED";
else 
co="YELLOW";
l=1;
a=IPXR;
System.out.println(A+"\n");
System.out.println(IPXR+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 15:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.4+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="4+128";

if(st==1)
cost="₹71,000";
else
cost="₹80,000";
System.out.println("1.CLEARLY WHITE \n2.NOT PINK \n3.JUST BLACK");
c=mb.nextInt();
if(c==1)
co="CLEARLY WHITE";
else if(c==2)
co="NOT PINK";
else 
co="JUST BLACK";
l=11;
a=G3;
System.out.println(G+"\n");
System.out.println(G3+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 16:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+64 \n2.4+128");
st=mb.nextInt();
if(st==1)
s="4+64";
else
s="4+128";

if(st==1)
cost="₹83,000";
else
cost="₹92,000";
System.out.println("1.CLEARLY WHITE \n2.NOT PINK \n3.JUST BLACK");
c=mb.nextInt();
if(c==1)
co="CLEARLY WHITE";
else if(c==2)
co="NOT PINK";
else 
co="JUST BLACK";
l=4;
a=G3XL;
System.out.println(G+"\n");
System.out.println(G3XL+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break;

case 17:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+128 \n2.4+256 \n3.4+512");
st=mb.nextInt();
if(st==1)
s="4+128";
else if(st==2)
s="4+256";
else
s="4+512";

if(st==1)
cost="₹99,900";
else if(st==2)
cost="₹1,14,900";
else
cost="₹1,34,900";
System.out.println("1.GOLD \n2.SILVER \n3.SPACE GREY");
c=mb.nextInt();
if(c==1)
co="GOLD";
else if(c==2)
co="SILVER";
else 
co="SPACE GREY";
l=2;
a=IPXS;
System.out.println(A+"\n");
System.out.println(IPXS+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
break ;

case 18:
{
System.out.println("ENTER STORAGE & RAM SIZE OF MOBILE");
System.out.println("1.4+128 \n2.4+256 \n3.4+512");
st=mb.nextInt();
if(st==1)
s="4+128";
else if(st==2)
s="4+256";
else
s="4+512";

if(st==1)
cost="₹1.09,900";
else if(st==2)
cost="₹1,24,900";
else
cost="₹1,44,900";
System.out.println("1.GOLD \n2.SILVER \n3.SPACE GREY");
c=mb.nextInt();
if(c==1)
co="GOLD";
else if(c==2)
co="SILVER";
else 
co="SPACE GREY";
l=3;
a=IPXSM;
System.out.println(A+"\n");
System.out.println(IPXSM+"\n11.COLOR                  :\t"+co+"\n12.STORAGE & RAM          :\t"+s+"\n\n\n"+"COST                      :\t"+cost);
}
}
}


System.out.println("WOULD YOU LIKE COMPARING IT WITH OTHER PHONE??\n1.IF YES\n2.IF NO");
int j=mb.nextInt();
switch(j)
{
case 1:
{
System.out.println("SELECT MOBILE PHONE TO COMPARE\n");
System.out.println("1.IPHONE XR\n2.IPHONE XS\n3.IPHONE XS MAX\n4.PIXEL 3XL\n5.POCO F1\n6.REDMI 6PRO\n7.ONE PLUS 6\n8.REALME 2\n9.ONEPLUS 6T"+
"\n10.REALME 2PRO\n11.PIXEL 2XL\n12.PIXEL 3\n13.REDMI NOTE 5 PRO\n14.SAMSUNG GALAXY A7\n15.NOTE 9\n16.J6+\n17.S9+\n18.REAL ME 1");
int comp=mb.nextInt();
System.out.println(d+"  MOBILE SELECTED TO COMPARE  "+d+"\n\n");
if(comp==1)
    System.out.print(IPXR);
if(comp==2)
    System.out.print(IPXS);
if(comp==3)
    System.out.print(IPXSM);
if(comp==4)
    System.out.print(G3XL);
if(comp==5)
    System.out.print(PF1);
if(comp==6)
    System.out.print(R6P);
if(comp==7)
    System.out.print(OP6);
if(comp==8)
    System.out.print(RM2);
if(comp==9)
    System.out.print(OP6T);
if(comp==10)
    System.out.print(RM2P);
if(comp==11)
    System.out.print(G2XL);
if(comp==12)
    System.out.print(G3);
if(comp==13)
    System.out.print(RN5P);
if(comp==14)
    System.out.print(SA7);
if(comp==15)
    System.out.print(N9);
if(comp==16)
    System.out.print(J6);
if(comp==17)
    System.out.print(S9);
if(comp==18)
    System.out.print(RM1);
System.out.println("\n11.COLOR                  :\tYOUR CHOICE"+"\n12.STORAGE & RAM          :\tYOUR CHOICE\n\n");
System.out.println(d+"  MOBILE SELECTED  "+d+"\n\n");
for(int n=1;n<=18;n++)
{
if(l==n)
System.out.print(a);
}
System.out.println("\n11.COLOR                  :\tYOUR CHOICE"+"\n12.STORAGE & RAM          :\tYOUR CHOICE\n\n");
}
case 2:
{
System.out.println("*|*|*|*|*|*|*|*|*|*|*|*|*|*  THANK YOU  *|*|*|*|*|*|*|*|*|*|*|*|*|*");
}
}
}
}
