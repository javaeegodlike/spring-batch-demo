package com.huaxin.mapper;

import com.huaxin.dto.DeviceCommand;
import org.springframework.batch.item.file.LineMapper;

public class HelloLineMapper implements LineMapper<DeviceCommand> {

    public DeviceCommand mapLine(String line, int lineNumber) throws Exception {

        //逗号分隔每一行数据
        String[] args = line.split(",");

        //创建DeviceCommand对象
        DeviceCommand deviceCommand = new DeviceCommand();

        deviceCommand.setId(args[0]);
        deviceCommand.setStatus(args[1]);

        return  deviceCommand;
    }
}
