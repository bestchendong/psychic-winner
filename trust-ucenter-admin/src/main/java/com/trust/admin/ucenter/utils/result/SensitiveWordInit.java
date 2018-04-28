package com.trust.admin.ucenter.utils.result;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;

/**
 * 构建敏感词库  加入到内存中HashMap  构建DFA算法模型
 *
 */
public class SensitiveWordInit {

    public HashMap sensitiveWordMap;

    /**
     * 读取敏感词库txt 放在HashSet中
     */
    public Set<String> initSensitiveSet() throws Exception{
        HashSet<String> hashSet = new HashSet<String>();
        try {
            File file = new File("E:\\SensitiveWord.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            if(file.exists()){//文件存在
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//读入文件流
                String text = "";
                while ((text = bufferedReader.readLine())!=null){
                    hashSet.add(text);//加载在set中
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  hashSet;
    }

    /**
     * 组织DFA 算法  HashMap
     */
    public void addSensitiveSetToHashMap(Set<String> keyWordSet){
        sensitiveWordMap = new HashMap(keyWordSet.size());
        Iterator<String> iterator = keyWordSet.iterator();

        while (iterator.hasNext()){
            Map curMap = sensitiveWordMap;//for循环中当前map
            String key = iterator.next();
            if(key!=null && key.length()>0){
                char keyChars[] = key.toCharArray();
                for(int i=0;i<keyChars.length;i++){
                    char keyChar = keyChars[i];
                    if(curMap.get(keyChar)!=null){//如果存在
                        curMap = (Map)curMap.get(keyChar);

                    }else{//如果不存在  新建
                        Map newMap = new HashMap();
                        newMap.put(keyChar,newMap);

                        curMap.put("isEnd",0);
                        curMap.putAll(newMap);
                        if(i==keyChars.length-1){
                            curMap.put("isEnd",1);
                        }

                    }
                }
            }
        }
    }

}
