package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A log entry for the logfile in Lab #1
 * @author Ian Clement
 * @author YOU!
 */
public class Log implements Comparable<Log> {

    // Fields
    private Date timestamp;
    private IPAddress ipAddress;
    private String serviceName;
    private int length;

    /**
     * TODO
     * @param TODO
     */
    public Log(String line) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-ddThh:mm:ss.SSS");
        String[] fields = line.split("\\s");
        this.ipAddress = new IPAddress(fields[0]);
        this.serviceName = fields[1];

        Date date = formatter.parse(fields[2]);
        this.timestamp = date;
        this.length = Integer.parseInt(fields[3]);
    }

    /**
     * Get log entry's timestamp
     * @return timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Get log entry's IP address
     * @return IP address
     */
    public IPAddress getIpAddress() {
        return ipAddress;
    }

    /**
     * Get log entry's byte length
     * @return byte length
     */
    public int getLength() {
        return length;
    }

    /**
     * Update the log entry's byte length
     * @param length new byte length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Get log entry's service name
     * @return service name
     */
    public String getServiceName() {
        return serviceName;
    }


    @Override
    public String toString() {

        return (this.ipAddress.toString() + " " + this.serviceName + " " + this.timestamp.toString() + " " + this.length);

    }

    /**
     * Compare the current Log object with another according to the following:
     * - TODO
     * @param rhs the Log to compare with
     * @return
     */
    @Override
    public int compareTo(Log rhs) {
        int ip = this.ipAddress.compareTo(rhs.ipAddress);

        if(ip != 0){
            return ip;
        }

        int sn = this.serviceName.compareTo(rhs.serviceName);

        if(sn != 0 ){
            return sn;
        }

        return this.timestamp.compareTo(rhs.timestamp);
    }
}
