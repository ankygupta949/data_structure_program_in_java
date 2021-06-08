class Example {
//value 0-15
// 8 - Fuel
// 4 - Fixed
// 2 - Variable
// 1 - Other
private Integer componentApproveStatus = 0;

public boolean getFuelApproved() {
        return (this.componentApproveStatus & 0b1000) == 8;
        }

public void setFuelApproved(boolean status) {
        if (status) {
        this.componentApproveStatus = (this.componentApproveStatus | 0b1000);
        } else {
        this.componentApproveStatus = (this.componentApproveStatus & ~(1 << 3));
        }
        }


public boolean getFixedApproved() {
        return (this.componentApproveStatus & 0b0100) == 4;
        }

public void setFixedApproved(boolean status) {
        if (status) {
        this.componentApproveStatus = (this.componentApproveStatus | 0b0100);
        } else {
        this.componentApproveStatus = (this.componentApproveStatus & ~(1 << 2));
        }
        }

public boolean getVariableApproved() {
        return (this.componentApproveStatus & 0b0010) == 2;
        }

public void setVariableApproved(boolean status) {
        if (status) {
        this.componentApproveStatus = (this.componentApproveStatus | 0b0010);
        } else {
        this.componentApproveStatus = (this.componentApproveStatus & ~(1 << 1));
        }
        }

public boolean getOtherApproved() {
        return (this.componentApproveStatus & 0b0001) == 1;
        }

    public void setOtherApproved(boolean status) {
        if (status) {
        this.componentApproveStatus = (this.componentApproveStatus | 0b0001);
        } else {
        this.componentApproveStatus = (this.componentApproveStatus & ~(1 << 0));
        }
        }

        // don't use this method in actual (use only above getter methods)
        public Integer getComponentApproveStatus(){
    return this.componentApproveStatus;
        }

    // don't use this method in actual (use only above settor methods)
        public void setComponentApproveStatus(Integer approveStatus){
            this.componentApproveStatus=approveStatus;
        }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.setFixedApproved(true);
        ex.setVariableApproved(true);

        System.out.println(ex.getComponentApproveStatus()); //6



        Example example2 = new Example();
        example2.setComponentApproveStatus(9);
        System.out.println(example2.getFuelApproved());//true
        System.out.println(example2.getFixedApproved()); //false
        System.out.println(example2.getVariableApproved()); //false
        System.out.println(example2.getOtherApproved()); //true
    }

        }
