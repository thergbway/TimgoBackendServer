package timgo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import timgo.services.UserService;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static timgo.common.Paths.GET_STATIC_CONTENT_METHOD;
import static timgo.common.Paths.USER_100_PIC;

@Controller
public class StaticWebContentController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = GET_STATIC_CONTENT_METHOD + USER_100_PIC,
        method = RequestMethod.GET,
        produces = "image/jpg")
    public @ResponseBody byte[] getUser100Pic(@RequestParam("userId") Integer id) throws IOException {
        byte[] userPicture = userService.getUserPicture(id);
        ByteArrayOutputStream bao = new ByteArrayOutputStream();

        BufferedImage img = ImageIO.read(new ByteArrayInputStream(userPicture));

        ImageIO.write(img, "jpg", bao);

        return bao.toByteArray();
    }
}