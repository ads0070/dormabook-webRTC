package io.github.dorma.webrtc.payload;

import lombok.Getter;

@Getter
public class UploadTsFileRes {
    private String fileName;
    private String saveRoute;
    private String saveName;
    private Long roomNo;

    public UploadTsFileRes(String fileName, String saveRoute, String saveName, Long roomNo) {
        this.fileName = fileName;
        this.saveRoute = saveRoute;
        this.saveName = saveName;
        this.roomNo = roomNo;
    }
}
