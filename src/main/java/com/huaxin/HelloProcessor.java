package com.huaxin;

import com.huaxin.dto.DeviceCommand;
import org.springframework.batch.item.ItemProcessor;

public class HelloProcessor implements ItemProcessor<DeviceCommand,DeviceCommand> {

    public DeviceCommand process(DeviceCommand deviceCommand) throws Exception {

       //模拟下发命令给设备
        System.out.println("send command to device,id="+deviceCommand.getId());
        //更新命令状态
        deviceCommand.setStatus("sent");
        //返回命令对象
        return  deviceCommand;
    }
}
