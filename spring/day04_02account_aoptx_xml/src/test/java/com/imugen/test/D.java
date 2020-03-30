package com.imugen.test;

/**
 * @author Daniel Liu 2020/3/26 10:37
 */
public class D {

    public static void main(String[] args) {
        if (!"".equals("11111-1_192_1501576750773.pdf")) {
            String [] names = "11111-1_192_1501576750773.pdf".split("_");
            if(names.length>1) {
                String resourceName = "";
                for(int i=0;i<names.length - 1;i++){
                    resourceName = resourceName + names[i] + "_";
                }
                if (!"".equals(resourceName)) {
                    resourceName = resourceName.substring(0, resourceName.length() - 1);
                }
                System.out.println("resourceName = " + resourceName );
            }
        }
    }
}