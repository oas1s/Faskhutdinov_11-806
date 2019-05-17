package com.company.superbestawesomeframework;

import com.company.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class SuperBestAwesomeFramework {
        public static <T> List<T> getManyWithCons(Class<T> c, int count,Object... params) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
            int paramsLength = params.length;

            Class[] classes = new Class[paramsLength];
            for (int i = 0; i < paramsLength; i++) {
                classes[i] = params[i].getClass();
            }
            Class[] finalArr = new Class[paramsLength];
            Constructor[] constructors = c.getConstructors();
            for(Constructor constructor : constructors){
                Class[] consParamTypes = constructor.getParameterTypes();
                if(consParamTypes.length == classes.length){
                    for (int i = 0; i < paramsLength; i++){
                        if(classes[i].equals(consParamTypes[i])){
                            finalArr[i] = consParamTypes[i];
                        }
                        else if(classes[i].equals(Byte.class)){
                            finalArr[i] = byte.class;
                        }
                        else if(classes[i].equals(Short.class)){
                            finalArr[i] = short.class;
                        }
                        else if(classes[i].equals(Integer.class)){
                            finalArr[i] = int.class;
                        }
                        else if(classes[i].equals(Long.class)){
                            finalArr[i] = long.class;
                        }
                        else if(classes[i].equals(Float.class)){
                            finalArr[i] = float.class;
                        }
                        else if(classes[i].equals(Character.class)){
                            finalArr[i] = char.class;
                        }
                        else if(classes[i].equals(Boolean.class)){
                            finalArr[i] = boolean.class;
                        }
                        else {
                            continue;
                        }
                    }
                    break;
                }
                else continue;
            }
            List<T> l = new ArrayList<>();
            try {
                Constructor constructor = c.getConstructor(finalArr);
                for (int i = 0; i < count; i++) {
                    l.add((T) constructor.newInstance(params));
                }
            }
            catch (IllegalArgumentException e){
                throw new IllegalArgumentException("This class dont have this constructor");
            }
            return l;
        }
    }
