class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.d = {1:big, 2:medium, 3:small}

    def addCar(self, carType: int) -> bool:
        if self.d[carType] == 0:
            return False
        self.d[carType]-=1
        return True


# Your ParkingSystem object will be instantiated and called as such:
# obj = ParkingSystem(big, medium, small)
# param_1 = obj.addCar(carType)
