package metacommandpattern;

/**
 * @author lizhengjun
 */
public interface Command {
    /**
     * 执行方法
     */
    public void execute();

    /**
     * 撤销方法
     */
    public void undo();
}
