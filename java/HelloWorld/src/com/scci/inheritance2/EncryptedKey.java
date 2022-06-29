package com.scci.inheritance2;

class EncryptedKey{
}

interface OperateCar {
    default public int startEngine(EncryptedKey key) {
        // Implementation
        return 0;
    }
}
interface FlyCar {
    default public int startEngine(EncryptedKey key) {
        // Implementation
        return 0;    
    }
}
 
class FlyingCar implements FlyCar {
	public void start() {
		startEngine(new EncryptedKey());
	}

//	@Override
//	public int startEngine(EncryptedKey key) {
//		// TODO Auto-generated method stub
//		return FlyCar.super.startEngine(key);
//	}
//    public int startEngine(EncryptedKey key) {
//        FlyCar.super.startEngine(key);
//        OperateCar.super.startEngine(key);
//        return 0;        
//    }
}

