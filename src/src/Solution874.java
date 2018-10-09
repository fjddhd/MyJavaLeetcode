public class Solution874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        int orient=1,endTerm=0;//1北2东3南4西
        int[] robot=new int[2];
        for (int i=0;i<commands.length;++i){
            endTerm=0;
            int commandInstruction=commands[i];
            if (commandInstruction==-2){
                orient--;
                if (orient==0)
                    orient=4;
                continue;
            }
            else if (commandInstruction==-1){
                orient++;
                if (orient==5)
                    orient=1;
                continue;
            }

            for (int j=0;j<commandInstruction;++j){
                if (orient==1 && endTerm==0){
                    robot[1]++;
                    for (int m=0;m<obstacles.length;++m){
                        if (obstacles[m][0]==robot[0] && obstacles[m][1]==robot[1]){
                            robot[1]--;
                            endTerm=1;
                        }
                    }
                }
                else if (orient==2 && endTerm==0){
                    robot[0]++;
                    for (int m=0;m<obstacles.length;++m){
                        if (obstacles[m][0]==robot[0] && obstacles[m][1]==robot[1]){
                            robot[0]--;
                            endTerm=1;
                        }
                    }
                }
                else if (orient==3 && endTerm==0){
                    robot[1]--;
                    for (int m=0;m<obstacles.length;++m){
                        if (obstacles[m][0]==robot[0] && obstacles[m][1]==robot[1]){
                            robot[1]++;
                            endTerm=1;
                        }
                    }
                }
                else if (orient==4 && endTerm==0){
                    robot[0]--;
                    for (int m=0;m<obstacles.length;++m){
                        if (obstacles[m][0]==robot[0] && obstacles[m][1]==robot[1]){
                            robot[0]++;
                            endTerm=1;
                        }
                    }
                }
            }
            System.out.print(robot[0]+"|||");
            System.out.println(robot[1]);
        }
        return robot[0]*robot[0]+robot[1]*robot[1];
    }
}
