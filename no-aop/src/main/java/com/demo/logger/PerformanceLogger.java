package com.demo.logger;

public class PerformanceLogger {

    public PerformanceInfo begin(String name){
        return new PerformanceInfo(name,System.currentTimeMillis());
    }
    public void end(PerformanceInfo info){
        long starttime=info.getTime();
        long endtime=System.currentTimeMillis();
        System.out.println(info.getName()+"take time::"+(endtime-starttime)+" millisecond");
    }
    public static class PerformanceInfo{
        String name;
        long time;

        public PerformanceInfo(String name, long time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public long getTime() {
            return time;
        }
    }
}
