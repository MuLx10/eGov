import cv2
import sys
cv2.imwrite(sys.argv[1],cv2.resize(cv2.imread(sys.argv[1]),(128,128)))
