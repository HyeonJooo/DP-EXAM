����   4 J  PROBLEM1/SpeedMonitor  java/lang/Object  java/util/Observer SPEED_TO_ALERT I ConstantValue   F 
observable Ljava/util/Observable; <init> ()V Code
     LineNumberTable LocalVariableTable this LPROBLEM1/SpeedMonitor; update +(Ljava/util/Observable;Ljava/lang/Object;)V  PROBLEM1/Speedometer	     currentSpeed	     java/lang/System ! " out Ljava/io/PrintStream; $ java/lang/StringBuilder & ** ALERT ** Driving too fast! (
 # (  ) (Ljava/lang/String;)V
  + , - getCurrentSpeed ()I
 # / 0 1 append (I)Ljava/lang/StringBuilder; 3 )
 # 5 0 6 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 # 8 9 : toString ()Ljava/lang/String;
 < > = java/io/PrintStream ? ) println A ... nice and steady ... ( obs obj Ljava/lang/Object; speedo LPROBLEM1/Speedometer; StackMapTable 
SourceFile SpeedMonitor.java !          	    
               /     *� �                               �     U+� � P+� N-� F� $� � #Y%� '-� *� .2� 4� 7� ;� !� � #Y@� '-� *� .2� 4� 7� ;�           
       3  6  T     *    U       U B     U C D   H E F  G    � 6 �   H    I