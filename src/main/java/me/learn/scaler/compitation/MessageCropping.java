package me.learn.scaler.compitation;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class MessageCropping {

    public static void main(String[] args) {
        MessageCropping mc = new MessageCropping();
        Stopwatch stopwatch = Stopwatch.createStarted();
        String result = mc.solution1("To crop or not to crop",21);
        stopwatch.stop();
        System.out.println("Result : "+result+"\n in time : "+stopwatch.elapsed(TimeUnit.NANOSECONDS));
    }

    public String solution(String message, int K) {

        String[] words =  message.split(" ");
        int len = words[0].length();
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            if((len + words[i].length() + 1) > K){
                return sb.toString();
            }else {
                sb.append(" ").append(words[i]);
                len += (words[i].length() + 1);
            }
        }


        return sb.toString();
    }

    public String solution1(String message, int K) {

        int len = message.length();
        int i = message.length()-1;
        while (len > K && i >= 0){
            if(message.charAt(i) == ' '){
                len = i;
            }
            i--;
        }


        return message.substring(0, len);

    }


}
