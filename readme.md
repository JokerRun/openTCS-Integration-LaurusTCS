# TCS集成开发

## 1.根据example源码生成本项目

略

## 2.项目启动

idea -> grade -> kernel -> task ->run

![image-20200206004431379](assets/image-20200206004431379.png)



同样方式启动plant-view

## 3.启动模拟器

### 3.1.调整gradle依赖,以支持模拟器日志打印

![image-20200206004629431](assets/image-20200206004629431.png)

### 3.2.启动模拟器

![image-20200206004747587](assets/image-20200206004747587.png)



多辆小车可以根据model中配置的小车端口来调整`de.fraunhofer.iml.opentcs.example.commadapter.vehicle.simulation.VehicleSimulator#VehicleSimulator`方法下的端口号,以模拟多辆不同小车.



![模型中配置的端口号](assets/image-20200206005532456.png)



![模拟器中根据端口号,以启动多辆小车](assets/image-20200206005431741.png)

## 4.开始TCS正常调试

本项目根目录下`attachment`附带了一些模型附件及相关配置

![image-20200206005144669](assets/image-20200206005144669.png)