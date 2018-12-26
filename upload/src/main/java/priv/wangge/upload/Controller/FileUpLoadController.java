package priv.wangge.upload.Controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController   //表示该类下的方法的返回值会自动做json格式的转换
public class FileUpLoadController {
    /*处理文件上传*/
    @RequestMapping("/fileuploadController")
    public Map<String, Object> fileupload(MultipartFile filename) throws Exception {

        System.out.println(filename.getOriginalFilename());

        filename.transferTo(new File("e:/" + filename.getOriginalFilename()));

        Map<String, Object> map = new HashMap<>();
        map.put("msg", "ok");

        return map;
    }
}
