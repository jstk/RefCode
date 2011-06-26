/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2011 Yan Cheng CHEOK <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.gui;

///import com.thoughtworks.xstream.XStream;
import java.awt.AlphaComposite;
import java.awt.Color;
///import java.awt.Container;
///import java.awt.Desktop;
///import java.awt.Dimension;
import java.awt.Font;
///import java.awt.Graphics;
///import java.awt.GraphicsConfiguration;
///import java.awt.GraphicsDevice;
///import java.awt.GraphicsEnvironment;
///import java.awt.HeadlessException;
import java.awt.Image;
///import java.awt.Transparency;
///import java.awt.event.ActionEvent;
///import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
///import java.awt.image.ColorModel;
///import java.awt.image.PixelGrabber;
///import java.beans.PropertyChangeEvent;
///import java.beans.PropertyChangeListener;
import java.io.Closeable;
import java.io.File;
///import java.io.FileInputStream;
///import java.io.FileNotFoundException;
///import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
///import java.io.InputStreamReader;
///import java.io.OutputStream;
///import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
///import java.io.Writer;
///import java.net.MalformedURLException;
///import java.net.URISyntaxException;
///import java.net.URL;
///import java.nio.charset.Charset;
///import java.text.DecimalFormat;
///import java.text.MessageFormat;
///import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
///import org.yccheok.jstock.engine.*;
import java.util.*;
import java.util.concurrent.Executor;
///import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
///import javax.imageio.ImageIO;
///import javax.sound.sampled.AudioInputStream;
///import javax.sound.sampled.AudioSystem;
///import javax.sound.sampled.Clip;
///import javax.sound.sampled.LineEvent;
///import javax.sound.sampled.LineListener;
import javax.swing.ButtonGroup;
///import javax.swing.ImageIcon;
import javax.swing.JComboBox;
///import javax.swing.JFileChooser;
///import javax.swing.JList;
import javax.swing.JRadioButton;
///import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
///import javax.swing.SwingUtilities;
///import javax.swing.UIManager;
///import javax.swing.event.HyperlinkEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicComboPopup;
///import net.sourceforge.pinyin4j.PinyinHelper;
///import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
///import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
///import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
///import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
///import org.apache.commons.httpclient.NameValuePair;
///import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
///import org.apache.commons.httpclient.methods.multipart.FilePart;
///import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
///import org.apache.commons.httpclient.methods.multipart.Part;
///import org.apache.commons.httpclient.methods.multipart.StringPart;
///import org.apache.commons.lang.CharUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
///import org.apache.commons.net.TimeTCPClient;
///import org.yccheok.jstock.analysis.Connection;
///import org.yccheok.jstock.analysis.DoubleConstantOperator;
///import org.yccheok.jstock.analysis.EqualityOperator;
///import org.yccheok.jstock.analysis.Indicator;
///import org.yccheok.jstock.analysis.OperatorIndicator;
///import org.yccheok.jstock.analysis.SinkOperator;
///import org.yccheok.jstock.analysis.StockOperator;
///import org.yccheok.jstock.internationalization.MessagesBundle;
///import org.yccheok.jstock.network.Utils.Type;

/**
 *
 * @author yccheok
 */
public class UtilsRef {
    /** Creates a new instance of Utils */
    private UtilsRef() {
    }

    /**
     * Adjust popup for combo box, so that horizontal scrollbar will not display.
     * http://forums.oracle.com/forums/thread.jspa?messageID=8037483&#8037483
     * http://www.camick.com/java/source/BoundsPopupMenuListener.java
     *
     * @param comboBox The combo box
     */
    public static void adjustPopupWidth(JComboBox comboBox) {
        ///deleted
    }

    /*
     *  I can't find any property on the scrollBar to determine if it will be
     *  displayed or not so use brute force to determine this.
     */
    private static int getScrollBarWidth(BasicComboPopup popup, JScrollPane scrollPane) {
        ///deleted
        return 0;
    }

    /*
     *  Get the scroll pane used by the popup so its bounds can be adjusted
     */
    private static JScrollPane getScrollPane(BasicComboPopup popup) {
        ///deleted
        return null;
    }

    /**
     * Restart the application.
     *
     * There are some important aspects to have in mind for this code:
     * + The application's main class must be in a jar file. mainFrame
     *   must be an instance of any class inside the same jar file (could be the
     *   main class too).
     * + The called java VM will be the same that the application is currently
     *   running on.
     * + There is no special error checking: the java VM may return an error like
     *   class not found or jar not found, and it will not be caught by the code
     *   posted above.
     *
     * The function will never return if it doesn't catch an error. It would be
     * a good practice to close all the handlers that could conflict with the
     * 'duplicate' new application before calling restartApplication(). There
     * will be a small time (which depends on many factors) where both
     * applications will be running at the same time.
     *
     * @param mainFrame One and only one mainFrame
     * @return true if restart success
     */
    ///fake
    class MainFrame{};
    public static boolean restartApplication(MainFrame mainFrame)
    {
        ///deleted
        return false;
    }

    public static java.util.Date getNTPDate() {
        ///deleted
        return null;
    }

    public static boolean extractZipFile(String zipFilePath, boolean overwrite) {
        ///deleted
        return false;
    }

    public static boolean extractZipFile(File zipFilePath, boolean overwrite) {
        ///deleted
        return false;
    }

    // A value obtained from server, to ensure all JStock's users are getting
    // same value for same key.
    public static String getUUIDValue(String url, String key) {
        ///deleted
        return null;
    }

    public static Map<String, String> getUUIDValue(String url) {
        ///deleted
        return null;
    }

    /**
     * Returns <code>ZipEntry</code> which is usable in both Linux and Windows.
     *
     * @param zipEntryName zip entry name
     * @return <code>ZipEntry</code> which is usable in both Linux and Windows
     */
    public static ZipEntry getZipEntry(String zipEntryName) {
        ///delete
        return null;
    }
    
    private static List<String> getNTPServers()
    {
        ///deleted
         return null;
    }

    public static void launchWebBrowser(String address) {
        ///deleted
    }

    public static void launchWebBrowser(javax.swing.event.HyperlinkEvent evt) {
        ///deleted
    }

    public static java.awt.Image getScaledImage(Image image, int maxWidth, int maxHeight) {
        ///deleted
        return null;
    }
    
    // This method returns true if the specified image has transparent pixels
    private static boolean hasAlpha(Image image) {
        ///deleted
        return false;
    }
    
    // This method returns a buffered image with the contents of an image
    public static BufferedImage toBufferedImage(Image image) {
        ///deleted
        return null;
    }
    
    // Deletes all files and subdirectories under dir.
    // Returns true if all deletions were successful.
    // If a deletion fails, the method stops attempting to delete and returns false.
    public static boolean deleteDir(File dir, boolean deleteRoot) {
        ///deleted
        return false;
    }

    public static boolean createCompleteDirectoryHierarchyIfDoesNotExist(String directory) {
        ///deleted
        return false;
    }
    
    private static boolean createCompleteDirectoryHierarchyIfDoesNotExist(File f) {
        ///deleted
        return false;
    }
    
    public static boolean isFileOrDirectoryExist(String fileOrDirectory) {
        java.io.File f = new java.io.File(fileOrDirectory);
        return f.exists();
    }
    
    public static boolean createDirectoryIfDoesNotExist(String directory) {
        ///deleted
        return false;
    }
    
    public static String getUserDataDirectory() {
        ///deleted
        return null;
    }

    public static AlphaComposite makeComposite(float alpha) {
        ///deleted
        return null;
    }

    /**
     * Migrates configuration data from version 1.0.5y to 1.0.6.
     *
     * @return true if migration success
     */
    public static boolean migrateFrom105yTo106() {
        ///deleted
        return false;
    }

    public static Color getColor(double price, double referencePrice) {
        ///deleted
        return null;
    }
    
    // Deletes all files and subdirectories under dir.
    // Returns true if all deletions were successful.
    // If a deletion fails, the method stops attempting to delete and returns false.
    public static boolean deleteDir(File dir) {
        ///deleted
        return false;
    }

    /**
     * Returns empty stock based on given stock info.
     *
     * @param stockInfo the stock info
     * @return empty stock based on given stock info
     */
    ///fake
    class Stock {};
    class StockInfo{};
    class Code{};
    class Symbol{};
    public static Stock getEmptyStock(StockInfo stockInfo) {
        ///deleted
        return null;
    }

    /**
     * Returns empty stock based on given code and symbol.
     *
     * @param code the code
     * @param symbol the symbol
     * @return empty stock based on given code and symbol
     */
    public static Stock getEmptyStock(Code code, Symbol symbol) {
        ///deleted
        return null;
    } 

    public static void deleteAllOldFiles(File dir, int days) {
        ///deleted
    }

    public static String getApplicationVersionString() {
        ///deleted
        return null;
    }

    // If you try to call this method at different time with same source, the
    // resultant encrypted string will be different. The best part is, it is still
    // able to be decrypted back to the original source.
    public static String encrypt(String source)
    {
        ///delete
        return null;
    }

    public static String decrypt(String source)
    {
        ///delete
        return null;
    }

    public static String getJStockUUID() {
        ///delete
        return null;
    }

    public static boolean isWindows() {
        String windowsString = "Windows";
        String osName = System.getProperty("os.name");

        if (osName == null) return false;

        return osName.regionMatches(true, 0, windowsString, 0, windowsString.length());
    }

    public static Executor getZoombiePool()
    {
        ///deleted
        return null;
    }

    public static Indicator getLastPriceRiseAboveIndicator(double lastPrice)
    {
        ///deleted
        return null;
    }

    ///fake
    class Indicator {}
    public static Indicator getLastPriceFallBelowIndicator(double lastPrice)
    {
        ///deleted
        return null;
    }

    public static void setDefaultLookAndFeel() {
        ///delete
    }

    public static class CloudFile {
        ///deleted
    }

    public static CloudFile loadFromCloud(String username, String password) {
        ///delete
        return null;
    }

    private static class CaptchaRespond {
        ///deleted
    }

    private static CaptchaRespond getCapchaRespond(String respond) {
        ///deleted
        return null;
    }

    public static boolean saveToCloud(String username, String password, File file) {
        ///deleted
        return false;
    }

    public static boolean isCompatible(int applicationVersionID) {
        ///deleted
        return false;
    }

    /**
     * Get response body through non-standard POST method.
     * Please refer to <url>http://stackoverflow.com/questions/1473255/is-jakarta-httpclient-sutitable-for-the-following-task/1473305#1473305</url>
     *
     * @param uri For example, http://X/%5bvUpJYKw4QvGRMBmhATUxRwv4JrU9aDnwNEuangVyy6OuHxi2YiY=%5dImage?
     * @param formData For example, [SORT]=0,1,0,10,5,0,KL,0&[FIELD]=33,38,51
     * @return the response body. null if fail.
     */
    public static String getPOSTResponseBodyAsStringBasedOnProxyAuthOption(String uri, String formData) {
        ///org.yccheok.jstock.engine.Utils.setHttpClientProxyFromSystemProperties(httpClient);
        org.yccheok.jstock.gui.UtilsRef.setHttpClientProxyCredentialsFromJStockOptions(httpClient);

        final PostMethod method = new PostMethod(uri);
        final RequestEntity entity;
        try {
            entity = new StringRequestEntity(formData, "application/x-www-form-urlencoded", "UTF-8");
        } catch (UnsupportedEncodingException exp) {
            log.error(null, exp);
            return null;
        }
        method.setRequestEntity(entity);
        method.setContentChunked(false);

        ///final JStockOptions jStockOptions = MainFrame.getInstance().getJStockOptions();
        String respond = null;
        try {
            if (false/*jStockOptions.isProxyAuthEnabled()*/) {
                /* WARNING : This chunck of code block is not tested! */
                method.setFollowRedirects(false);
                httpClient.executeMethod(method);

                int statuscode = method.getStatusCode();
                if ((statuscode == HttpStatus.SC_MOVED_TEMPORARILY) ||
                    (statuscode == HttpStatus.SC_MOVED_PERMANENTLY) ||
                    (statuscode == HttpStatus.SC_SEE_OTHER) ||
                    (statuscode == HttpStatus.SC_TEMPORARY_REDIRECT)) {
                    //Make new Request with new URL
                    Header header = method.getResponseHeader("location");
                    /* WARNING : Correct method to redirect? Shall we use POST? How about form data? */
                    HttpMethod RedirectMethod = new GetMethod(header.getValue());
                    // I assume it is OK to release method for twice. (The second
                    // release will happen in finally block). We shouldn't have an
                    // unreleased method, before executing another new method.
                    method.releaseConnection();
                    // Do RedirectMethod within try-catch-finally, so that we can have a
                    // exception free way to release RedirectMethod connection.
                    // #2836422
                    try {
                        httpClient.executeMethod(RedirectMethod);
                        respond = RedirectMethod.getResponseBodyAsString();
                    }
                    catch (HttpException exp) {
                        log.error(null, exp);
                        return null;
                    }
                    catch (IOException exp) {
                        log.error(null, exp);
                        return null;
                    }
                    finally {
                        RedirectMethod.releaseConnection();
                    }
                }
                else {
                    respond = method.getResponseBodyAsString();
                } // if statuscode = Redirect
            }
            else {
                httpClient.executeMethod(method);
                respond = method.getResponseBodyAsString();
            } //  if jStockOptions.isProxyAuthEnabled()
        }
        catch (HttpException exp) {
            log.error(null, exp);
            return null;
        }
        catch (IOException exp) {
            log.error(null, exp);
            return null;
        }
        finally {
            method.releaseConnection();
        }
        return respond;
    }

    // We prefer to have this method in gui package instead of engine. This is because it requires
    // access to JStockOptions.
    // Returns null if fail.
    private final static boolean mytest = true;
    public static String getResponseBodyAsStringBasedOnProxyAuthOption(String request) {
        ///org.yccheok.jstock.engine.Utils.setHttpClientProxyFromSystemProperties(httpClient);
        if(!mytest)org.yccheok.jstock.gui.UtilsRef.setHttpClientProxyCredentialsFromJStockOptions(httpClient);

        final HttpMethod method = new GetMethod(request);
        ///final JStockOptions jStockOptions = MainFrame.getInstance().getJStockOptions();
        String respond = null;
        try {
            if (true/*!mytest&&jStockOptions.isProxyAuthEnabled()*/) {
                method.setFollowRedirects(false);
                httpClient.executeMethod(method);

                int statuscode = method.getStatusCode();
                if ((statuscode == HttpStatus.SC_MOVED_TEMPORARILY) ||
                    (statuscode == HttpStatus.SC_MOVED_PERMANENTLY) ||
                    (statuscode == HttpStatus.SC_SEE_OTHER) ||
                    (statuscode == HttpStatus.SC_TEMPORARY_REDIRECT)) {
                    //Make new Request with new URL
                    Header header = method.getResponseHeader("location");
                    HttpMethod RedirectMethod = new GetMethod(header.getValue());
                    // I assume it is OK to release method for twice. (The second
                    // release will happen in finally block). We shouldn't have an
                    // unreleased method, before executing another new method.
                    method.releaseConnection();
                    // Do RedirectMethod within try-catch-finally, so that we can have a
                    // exception free way to release RedirectMethod connection.
                    // #2836422
                    try {
                        httpClient.executeMethod(RedirectMethod);
                        respond = RedirectMethod.getResponseBodyAsString();
                    }
                    catch (HttpException exp) {
                        log.error(null, exp);
                        return null;
                    }
                    catch (IOException exp) {
                        log.error(null, exp);
                        return null;
                    }
                    finally {
                        RedirectMethod.releaseConnection();
                    }
                }
                else {
                    respond = method.getResponseBodyAsString();
                } // if statuscode = Redirect
            }
            else {
                httpClient.executeMethod(method);
                respond = method.getResponseBodyAsString();
            } //  if jStockOptions.isProxyAuthEnabled()
        }
        catch (HttpException exp) {
            log.error(null, exp);
            return null;
        }
        catch (IOException exp) {
            log.error(null, exp);
            return null;
        }
        finally {
            method.releaseConnection();
        }
        return respond;
    }

    public static class InputStreamAndMethod {
        public final InputStream inputStream;
        public final HttpMethod method;
        public InputStreamAndMethod(InputStream inputStream, HttpMethod method) {
            this.inputStream = inputStream;
            this.method = method;
        }
    }

    // Unlike getResponseBodyAsStringBasedOnProxyAuthOption, method must be closed
    // explicitly by caller. If not, the returned input stream will not be valid.
    // The returned InputStreamAndMethod and InputStreamAndMethod.method will always be non-null.
    //
    // InputStreamAndMethod.inputStream will be null if we fail to get any respond.
    //
    // We must always remember to close InputStreamAndMethod.method, after finish
    // reading InputStreamAndMethod.inputStream.
    public static InputStreamAndMethod getResponseBodyAsStreamBasedOnProxyAuthOption(String request) {
        ///org.yccheok.jstock.engine.Utils.setHttpClientProxyFromSystemProperties(httpClient);
        org.yccheok.jstock.gui.UtilsRef.setHttpClientProxyCredentialsFromJStockOptions(httpClient);

        final GetMethod method = new GetMethod(request);
        ///final JStockOptions jStockOptions = MainFrame.getInstance().getJStockOptions();
        InputStreamAndMethod inputStreamAndMethod = null;
        InputStream respond = null;
        HttpMethod methodToClosed = method;

        try {
            if (false/*jStockOptions.isProxyAuthEnabled()*/) {
                method.setFollowRedirects(false);
                httpClient.executeMethod(method);

                int statuscode = method.getStatusCode();
                if ((statuscode == HttpStatus.SC_MOVED_TEMPORARILY) ||
                    (statuscode == HttpStatus.SC_MOVED_PERMANENTLY) ||
                    (statuscode == HttpStatus.SC_SEE_OTHER) ||
                    (statuscode == HttpStatus.SC_TEMPORARY_REDIRECT)) {
                    //Make new Request with new URL
                    Header header = method.getResponseHeader("location");
                    GetMethod RedirectMethod = new GetMethod(header.getValue());
                    methodToClosed = RedirectMethod;
                    method.releaseConnection();
                    // Do RedirectMethod within try-catch-finally, so that we can have a
                    // exception free way to release RedirectMethod connection.
                    // #2836422                    
                    try {
                        httpClient.executeMethod(RedirectMethod);
                        respond = RedirectMethod.getResponseBodyAsStream();
                    }
                    catch (HttpException exp) {
                        log.error(null, exp);
                    }
                    catch (IOException exp) {
                        log.error(null, exp);
                    }
                }
                else {
                    methodToClosed = method;
                    respond = method.getResponseBodyAsStream();
                } // if statuscode = Redirect
            }
            else {
                methodToClosed = method;
                httpClient.executeMethod(method);
                respond = method.getResponseBodyAsStream();
            } //  if jStockOptions.isProxyAuthEnabled()
        }
        catch (HttpException exp) {
            log.error(null, exp);
        }
        catch (IOException exp) {
            log.error(null, exp);
        }
        finally {
            inputStreamAndMethod = new InputStreamAndMethod(respond, methodToClosed);
        }

        return inputStreamAndMethod;
    }

    // We prefer to have this method in gui package instead of engine. This is because it requires
    // access to JStockOptions.
    private static void setHttpClientProxyCredentialsFromJStockOptions(HttpClient httpClient) {
        ///final JStockOptions jStockOptions = MainFrame.getInstance().getJStockOptions();
        if (true/*jStockOptions.isProxyAuthEnabled() == false*/) {
            httpClient.getState().clearCredentials();
        }
        else {
            ///httpClient.getState().setProxyCredentials(AuthScope.ANY, jStockOptions.getCredentials());
        }
    }

    /*
     * Get the extension of a file.
     */
    public static String getFileExtension(String s) {
        String ext = "";
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }

    /*
     * Get the extension of a file.
     */
    public static String getFileExtension(File f) {
        return getFileExtension(f.getName());
    }

    public static ApplicationInfo getLatestApplicationInfo() {
        ///deleted
        return null;
    }

    public static int getApplicationVersionID() {
        ///deleted
        return 0;
    }

    public static String toHTML(String plainText) {
        plainText = plainText.replace(System.getProperty("line.separator"), "<br>");
        return "<html><head></head><body>" + plainText + "</body></html>";
    }

    @SuppressWarnings("unchecked")
    public static <A> A fromXML(Class c, Reader reader) {
        ///deleted
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <A> A fromXML(Class<A> c, File file) {
        ///deleted
        return null;
    }

    @SuppressWarnings("unchecked")
    public static <A> A fromXML(Class<A> c, String filePath) {
        ///deleted
        return null;
    }

    public static boolean toXML(Object object, File file) {
        ///deleted
        return true;
    }

    public static boolean toXML(Object object, String filePath) {
        ///deleted
        return false;
    }

    public static String getExtraDataDirectory() {
        //deleted
        return null;
    }

    public static String toHTMLFileSrcFormat(String fileName) {
        ///deleted
        return null;
    }

   public static class FileEx {
       ///deleted
   }

    // Calling to this method will affect state of JStockOptions.
    // Returns null if no file being selected.
    public static FileEx promptSavePortfolioCSVAndExcelJFileChooser(final String suggestedFileName) {
        ///deleted
        return null;
    }

    // This method returns the selected radio button in a button group
    public static JRadioButton getSelection(ButtonGroup group) {
        ///deleted
        return null;
    }

    private static File promptOpenJFileChooser(FileNameExtensionFilter... fileNameExtensionFilters) {
        ///deleted
        return null;
    }

    public static void playAlertSound() {
        ///deleted
    }

    // Calling to this method will affect state of JStockOptions.
    // Returns null if no file being selected.
    public static File promptOpenCSVAndExcelJFileChooser() {
        ///deleted
        return null;
    }

    public static File promptOpenZippedJFileChooser() {
        ///deleted
        return null;
    }

    public static String stockPriceDecimalFormat(Object value) {
        ///deleted
        return null;
    }

    public static String stockPriceDecimalFormat(double value) {
        ///deleted
        return null;
    }

    private static File promptSaveJFileChooser(String suggestedFileName, FileNameExtensionFilter... fileNameExtensionFilters) {
        ///deleted
        return null;
    }

    public static File promptSaveZippedJFileChooser(String suggestedFileName) {
        ///deleted
        return null;
    }

    /**
     * Get a new bold version of specified font, with rest of specified font
     * attributes remained the same.
     * 
     * @param font specified font
     * @return a new bold version of specified font
     */
    public static Font getBoldFont(Font font) {
        ///deleted
        return null;
    }

    // Calling to this method will affect state of JStockOptions.
    // Returns null if no file being selected.
    public static File promptSaveCSVAndExcelJFileChooser(String suggestedFileName) {
        ///deleted
        return null;
    }

    /**
     * Performs close operation on ZIP output stream, without the need of
     * writing cumbersome try...catch block.
     *
     * @param zipOutputStream The ZIP input stream.
     * @return Returns false if there is an exception during close operation.
     * Otherwise returns true.
     */
    public static boolean closeEntry(ZipOutputStream zipOutputStream) {
        ///deleted
        return false;
    }

    /**
     * Performs close operation on ZIP input stream, without the need of
     * writing cumbersome try...catch block.
     *
     * @param zipInputStream The ZIP input stream.
     */
    public static void closeEntry(ZipInputStream zipInputStream) {
        ///deleted
    }

    /**
     * Performs close operation on Closeable stream, without the need of
     * writing cumbersome try...catch block.
     *
     * @param closeable The closeable stream.
     */
    public static void close(Closeable closeable) {
        ///delete
    }

    /**
     * Performs download and save the download as temporary file.
     * 
     * @param location Download URL location
     * @return The saved temporary file if download success. <code>null</code>
     * if failed.
     */
    public static File downloadAsTempFile(String location) {
        ///deleted
        return null;
    }

    /**
     * Returns list of Han Yu Pin Yin's prefix of every characters. If the
     * character is an alphabet or numerical, the original character will be
     * used. If there is any error occur during conversion, that particular
     * character will be ignored.
     *
     * @param chinese String to be converted
     * @return List of Han Yu Pin Yin's prefix of every characters.
     */
    public static List<String> toHanyuPinyin(String chinese) {
        ///deleted
        return null;
    }

    /**
     * Returns default currency symbol, regardless what country we are in right
     * now.
     *
     * @return Default currency symbol, regardless what country we are in right
     * now.
     */
    public static String getDefaultCurrencySymbol() {
        ///deleted
        return null;
    }
    
    /**
     * Represents latest application information. This is being used for
     * application upgrading.
     */
    public static class ApplicationInfo
    {
        ///deleted
    }

    ///private static final HanyuPinyinOutputFormat DEFAULT_HANYU_PINYIN_OUTPUT_FORMAT = new HanyuPinyinOutputFormat();
    static {
        ///DEFAULT_HANYU_PINYIN_OUTPUT_FORMAT.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        ///DEFAULT_HANYU_PINYIN_OUTPUT_FORMAT.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        ///DEFAULT_HANYU_PINYIN_OUTPUT_FORMAT.setVCharType(HanyuPinyinVCharType.WITH_V);
    }

    ///private static volatile List<String> NTPServers = null;

    // We will use this as directory name. Do not have space or special characters.
    ///private static final String APPLICATION_VERSION_STRING = "1.0.6";

    // For About box comparision on latest version purpose.
    // 1.0.6
    // Remember to update isCompatible method.
    ///private static final int APPLICATION_VERSION_ID = 1075;

    ///private static Executor zombiePool = Executors.newFixedThreadPool(Utils.NUM_OF_THREADS_ZOMBIE_POOL);

    ///private static final int NUM_OF_THREADS_ZOMBIE_POOL = 4;

    private static final HttpClient httpClient;

    static {
        MultiThreadedHttpConnectionManager multiThreadedHttpConnectionManager = new MultiThreadedHttpConnectionManager();
        multiThreadedHttpConnectionManager.getParams().setMaxTotalConnections(128);
        multiThreadedHttpConnectionManager.getParams().setDefaultMaxConnectionsPerHost(128);
        httpClient = new HttpClient(multiThreadedHttpConnectionManager);
        multiThreadedHttpConnectionManager.getParams().setMaxConnectionsPerHost(httpClient.getHostConfiguration(), 128);
    }
    private static final Log log = LogFactory.getLog(UtilsRef.class);
}
